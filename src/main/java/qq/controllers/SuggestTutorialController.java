package qq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuggestTutorialController {
	
	@RequestMapping("/suggesttutorial")
	String suggesttutorial() {
		return "app.suggesttutorial";
	}
}
