package tales.akiba.seldesian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tales.akiba.seldesian.service.SampleService;

@RestController
@RequestMapping(value = "/")
public class RestContoller {
	
	@Autowired
	SampleService sampleService;

	@GetMapping
	public String getWelcome() {
		String welcomeMessage = sampleService.welcomeReturner();
		return welcomeMessage;
	}
}
