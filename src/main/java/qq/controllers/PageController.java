package qq.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import qq.model.News;
import qq.service.NewsService;

@Controller
public class PageController {

	@Autowired
	private NewsService newsService;

	@RequestMapping("/")
	ModelAndView home(ModelAndView modelAndView) {
		modelAndView.setViewName("app.homepage");

		List<News> allNews = newsService.listAll();

		Collections.reverse(allNews);

		modelAndView.getModel().put("allNews", allNews);

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
		System.out.println(news.toString());
		return modelAndView;

	}
}
