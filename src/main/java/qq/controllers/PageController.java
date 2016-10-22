package qq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import qq.model.SiteUser;

@Controller
public class PageController {

	@RequestMapping("/")
	String home() {
		return "app.homepage";
	}

	@RequestMapping("/about")
	String about() {
		return "app.about";
	}

	@RequestMapping("/contact")
	String contact() {
		return "app.contact";
	}

	@RequestMapping("/messages")
	String messages() {
		return "app.messages";
	}

	@RequestMapping("/newsmanager")
	String newsmanager() {
		return "app.newsmanager";
	}

	@RequestMapping("/tutorialsmanager")
	String tutorialsmanager() {
		return "app.tutorialsmanager";
	}

	@RequestMapping("/profile")
	String profile() {
		return "app.profile";
	}

	@RequestMapping("/search")
	String search() {
		return "app.search";
	}

	@RequestMapping("/sendemails")
	String sendemails() {
		return "app.sendemails";
	}

	@RequestMapping("/tutorials")
	String tutorials() {
		return "app.tutorials";
	}

	@RequestMapping("/usersmanager")
	String usersmanager() {
		return "app.usersmanager";
	}
	

	
}
