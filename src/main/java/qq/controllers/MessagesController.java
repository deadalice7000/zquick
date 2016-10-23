package qq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessagesController {

	@RequestMapping("/messages")
	String messages() {
		return "app.messages";
	}
	
}
