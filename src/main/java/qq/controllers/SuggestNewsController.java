package qq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuggestNewsController {

	@RequestMapping("/suggestnews")
	String suggestnews() {
		return "app.suggestnews";
	}
	
}
