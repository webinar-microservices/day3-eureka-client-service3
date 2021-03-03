package in.webinar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service3")
public class ThirdService {
	
	@GetMapping("/")
	public String sayHello() {
		return "ThirdService!!";
	}

}
