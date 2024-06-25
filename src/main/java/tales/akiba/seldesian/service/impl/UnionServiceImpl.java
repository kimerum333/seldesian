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
	public Union registerUnion(Union params) {
		return unionMapper.insertUnion(params);
	}

	@Override
	public Union getUnionDetail(Long union_no) {
		return unionMapper.selectUnionDetail(union_no);
	}
	
	@Override
	public Union updateUnion(Long union_no) {
		return unionMapper.updateUnion(union_no);
	}
	
	@Override
	public Union confirmUnion(Long union_no) {
		return unionMapper.confirmUnion(union_no);
	}

	@Override
	public Union deleteUnion(Long union_no) {
		return unionMapper.deleteUnion(union_no);
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
