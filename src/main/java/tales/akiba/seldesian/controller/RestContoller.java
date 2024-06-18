package tales.akiba.seldesian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RestContoller {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
