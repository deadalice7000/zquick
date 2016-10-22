package qq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import qq.model.News;
import qq.service.NewsService;

@Controller
public class PageController {

	@Autowired
	private NewsService newsService;
	
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

	@RequestMapping(value="/newsmanager", method=RequestMethod.GET)
	ModelAndView addnews(ModelAndView modelAndView) {
		
		modelAndView.setViewName("app.newsmanager");
		
		News news = new News();
		
		modelAndView.getModel().put("news", news);
		return modelAndView;
	}
	

	@RequestMapping(value="/newsmanager", method=RequestMethod.POST)
	ModelAndView addnews(ModelAndView modelAndView, News news) {
		
		modelAndView.setViewName("app.newsmanager");
			
		newsService.add(news);
			
		
		return modelAndView;
	}

}
