package tales.akiba.prop.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tales.akiba.prop.dao.PropMapper;
import tales.akiba.prop.vo.PropVo;

@Repository("propMapper")
public class PropMapperImpl implements PropMapper {
	
	@Autowired
	private  SqlSession sqlSession;

	@Override
	public List<PropVo> getPropList() {
		List<PropVo>  propList =  sqlSession.selectList("Prop.getPropList");
		return propList;
	}

	@Override
	public PropVo getProp(PropVo vo) {
		PropVo  prop  =  sqlSession.selectOne("Prop.getProp", vo);	
		return  prop;
	}

	@Override
	public void deleteProp(PropVo vo) {
		sqlSession.delete( "Prop.PropDelete", vo );
	}

	@Override
	public void insertProp(PropVo vo) {
		sqlSession.insert("Prop.PropInsert", vo);
	}

	@Override
	public void updateProp(PropVo vo) {
		sqlSession.update("Prop.PropUpdate", vo);
	}

}
