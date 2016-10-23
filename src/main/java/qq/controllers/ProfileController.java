package qq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

	@RequestMapping("/profile")
	String profile() {
		return "app.profile";
	}
	
}
