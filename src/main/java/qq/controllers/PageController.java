package qq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import qq.model.News;
import qq.service.NewsService;

@Controller
public class PageController {

	@Autowired
	private NewsService newsService;

	@RequestMapping(value = "/")
	ModelAndView home(ModelAndView modelAndView, @RequestParam(value = "p", defaultValue = "1") int p) {

		Page<News> page = newsService.getPage(p);
	
		modelAndView.setViewName("app.homepage");
		modelAndView.getModel().put("page", page);

		
		
		return modelAndView;

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

	@RequestMapping(value = "/shownews/{title}")
	public ModelAndView showNews(ModelAndView modelAndView, @PathVariable("title") String title) {

		modelAndView.setViewName("app.shownews");

		News news = newsService.getByTitle(title);

		modelAndView.getModel().put("news", news);
		return modelAndView;

	}
}
