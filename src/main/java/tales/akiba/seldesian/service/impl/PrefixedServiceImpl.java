package tales.akiba.seldesian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tales.akiba.seldesian.dao.PrefixedMapper;
import tales.akiba.seldesian.entity.Prefixed;
import tales.akiba.seldesian.service.PrefixedService;

@Service 
@RequiredArgsConstructor
public class PrefixedServiceImpl implements PrefixedService {

    @Autowired
    private PrefixedMapper prefixedMapper;

	@Override
	public List<Prefixed> getPrefixedList() {
		List<Prefixed>  prefixedList  =  prefixedMapper.getPrefixedList(); 
		return    prefixedList;
	}

	@Override
	public Prefixed getView(Prefixed prefixed) {
		
		Prefixed  prefixeddata = prefixedMapper.getView(prefixed);
		
		return  prefixeddata;
	}

	@Override
	public void insertPrefixed(Prefixed prefixed) {

		prefixedMapper.insertPrefixed(prefixed);
		
	}

	@Override
	public void deletePrefixed(Prefixed prefixed) {

       prefixedMapper.deletePrefixed(prefixed);
		
	}

	@Override
	public void updatePrefixed(Prefixed prefixed) {
		
		prefixedMapper.updatePrefixed(prefixed);
		
	}

    
}