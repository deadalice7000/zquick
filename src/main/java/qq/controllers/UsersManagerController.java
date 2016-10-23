package qq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersManagerController {

	@RequestMapping("/usersmanager")
	String usersmanager() {
		return "app.usersmanager";
	}
	
}
