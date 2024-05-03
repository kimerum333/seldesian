package tales.akiba.seldesian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tales.akiba.seldesian.dao.SampleMapper;

@Service
public class SampleService {
	
	@Autowired
	SampleMapper sampleDao;
	
	public String welcomeReturner() {
		return sampleDao.selectWelcome();
	}
}
