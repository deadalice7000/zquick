package qq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TutorialsManagerController {

	@RequestMapping("/tutorialsmanager")
	String tutorialsmanager() {
		return "app.tutorialsmanager";
	}
	
}
