package qq.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import qq.model.News;
import qq.service.NewsService;

@Controller
public class PageController {

	@RequestMapping("/")
	String home() {
		return "app.homepage";

	}

	@RequestMapping("/tutorials")
	String tutorials() {
		return "app.tutorials";
	}

	@RequestMapping("/search")
	String search() {
		return "app.search";
	}

	@RequestMapping("/about")
	String about() {
		return "app.about";
	}

	@RequestMapping("/contact")
	String contact() {
		return "app.contact";
	}

}
