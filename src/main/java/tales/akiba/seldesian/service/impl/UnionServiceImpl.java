package tales.akiba.seldesian.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tales.akiba.seldesian.dao.UnionMapper;
import tales.akiba.seldesian.entity.Union;
import tales.akiba.seldesian.service.UnionService;

@Service
public class UnionServiceImpl implements UnionService{

	@Autowired
	private UnionMapper unionMapper;
	
	@Override
	public boolean registerUnion(Union params) {
		int queryResult = 0;
		if(params.getUnion_no() == null) {
			queryResult = unionMapper.insertUnion(params);
		} else {
			queryResult = unionMapper.updateUnion(params);
		}
		// 1이면 true, 아니면 false
		return queryResult == 1;
	}

	@Override
	public Union getUnionDetail(Long union_no) {
		return unionMapper.selectUnionDetail(union_no);
	}
	
	@Override
	public boolean confirmUnion(Long union_no) {
		int queryResult = 0;
		Union union = unionMapper.selectUnionDetail(union_no);
		// resister_yn이 0이면 신청 중, 1이면 승인됨, 2이면 삭제됨
		if(union!=null && 0 == (union.getUnion_resister_yn())) {
			queryResult = unionMapper.confirmUnion(union_no);
		}
		// 1이면 true, 아니면 false
		return queryResult == 1;
	}

	@Override
	public boolean deleteUnion(Long union_no) {
		int queryResult = 0;
		Union union = unionMapper.selectUnionDetail(union_no);
		// resister_yn이 0이면 신청 중, 1이면 승인됨, 2이면 삭제됨
		if(union!=null && 0 == (union.getUnion_resister_yn())) {
			queryResult = unionMapper.deleteUnion(union_no);
		} else if (union!=null && 1 == (union.getUnion_resister_yn())) {
			queryResult = unionMapper.deleteUnion(union_no);
		}
		// 1이면 true, 아니면 false
		return queryResult == 1;
	}

	@Override
	public List<Union> getUnionList() {
		List<Union> unionList = Collections.emptyList();
		int unionTotalCount = unionMapper.selectUnionTotalCount();
		
		if(unionTotalCount>0) {
			unionList = unionMapper.selectUnionList();
		}
		return unionList;
	}

}
