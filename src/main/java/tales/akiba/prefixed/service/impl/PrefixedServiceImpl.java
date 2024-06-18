package tales.akiba.prefixed.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tales.akiba.prefixed.dao.PrefixedMapper;
import tales.akiba.prefixed.service.PrefixedService;
import tales.akiba.prefixed.vo.PrefixedVo;

@Service("prefixedService")
public class PrefixedServiceImpl implements PrefixedService {
	
	@Autowired
	private PrefixedMapper prefixedDao;

	@Override
	public List<PrefixedVo> getPrefixedList() {
		List<PrefixedVo>  prefixedList  =  prefixedDao.getPrefixedList(); 
		return    prefixedList;
	}

	@Override
	public PrefixedVo getPrefixed(PrefixedVo vo) {
		PrefixedVo  prefixed = prefixedDao.getPrefixed(vo);
		return  prefixed;
	}

	@Override
	public void insertPrefixed(PrefixedVo vo) {
		prefixedDao.deletePrefixed( vo );
		
	}

	@Override
	public void deletePrefixed(PrefixedVo vo) {

		prefixedDao.insertPrefixed( vo );
		
	}

	@Override
	public void prefixedUpdate(PrefixedVo vo) {
		prefixedDao.updatePrefixed(vo);	
		
	}

}
