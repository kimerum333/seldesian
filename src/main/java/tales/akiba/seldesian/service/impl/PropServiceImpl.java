package tales.akiba.seldesian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tales.akiba.seldesian.dao.PropMapper;
import tales.akiba.seldesian.entity.Prop;
import tales.akiba.seldesian.service.PropService;

@Service 
@RequiredArgsConstructor
public class PropServiceImpl implements PropService {

    @Autowired
    private PropMapper propMapper;

	@Override
	public List<Prop> getPropList() {
		List<Prop>  propList  =  propMapper.getPropList(); 
		return    propList;
	}

	@Override
	public Prop getView(Prop prop) {
		
		Prop  propdata = propMapper.getView(prop);
		
		return  propdata;
	}

	@Override
	public void insertProp(Prop prop) {

		propMapper.insertProp(prop);
		
	}

	@Override
	public void deleteProp(Prop prop) {

       propMapper.deleteProp(prop);
		
	}

	@Override
	public void updateProp(Prop prop) {
		
		propMapper.updateProp(prop);
		
	}

    
}