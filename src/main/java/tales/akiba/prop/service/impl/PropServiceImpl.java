package tales.akiba.prop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tales.akiba.prop.dao.PropMapper;
import tales.akiba.prop.service.PropService;
import tales.akiba.prop.vo.PropVo;

@Service("propService")
public class PropServiceImpl implements PropService {
	
	@Autowired
	private PropMapper propDao;

	@Override
	public List<PropVo> getPropList() {
		
		List<PropVo>  propList  =  propDao.getPropList(); 
		
		return    propList;
	}

	@Override
	public PropVo getProp(PropVo vo) {

		PropVo  prop = propDao.getProp(vo);
		
		return  prop;
		
	}

	@Override
	public void insertProp(PropVo vo) {

		propDao.deleteProp( vo );
		
	}

	@Override
	public void deleteProp(PropVo vo) {

		propDao.insertProp( vo );
		
	}

	@Override
	public void propUpdate(PropVo vo) {

		propDao.updateProp(vo);	
		
	}

}
