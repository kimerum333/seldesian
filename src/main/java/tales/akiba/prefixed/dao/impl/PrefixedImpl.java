package tales.akiba.prefixed.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tales.akiba.prefixed.dao.PrefixedMapper;
import tales.akiba.prefixed.vo.PrefixedVo;

@Repository("prefixedMapper")
public class PrefixedImpl implements PrefixedMapper {
	
	@Autowired
	private  SqlSession sqlSession;

	@Override
	public List<PrefixedVo> getPrefixedList() {
		
		List<PrefixedVo>  prefixedList =  sqlSession.selectList("Prefixed.getPrefixedList");
		
		return prefixedList;
		
	}

	@Override
	public PrefixedVo getPrefixed(PrefixedVo vo) {
		PrefixedVo  prefixed  =  sqlSession.selectOne("Prefixed.getPrefixed", vo);
		
		return  prefixed;
	}

	@Override
	public void deletePrefixed(PrefixedVo vo) {

		sqlSession.delete( "Prefixed.PrefixedDelete", vo );
		
	}

	@Override
	public void insertPrefixed(PrefixedVo vo) {

		sqlSession.insert("Prefixed.PrefixedInsert", vo);
		
	}

	@Override
	public void updatePrefixed(PrefixedVo vo) {

		sqlSession.update("Prefixed.PrefixedUpdate", vo);
		
	}

}
