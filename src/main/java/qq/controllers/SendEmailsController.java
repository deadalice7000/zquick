package qq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SendEmailsController {

	@RequestMapping("/sendemails")
	String sendemails() {
		return "app.sendemails";
	}
	
}
