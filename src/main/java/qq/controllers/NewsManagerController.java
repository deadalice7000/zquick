package qq.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import qq.model.News;
import qq.service.NewsService;

@Controller
public class NewsManagerController {

	@Autowired
	private NewsService newsService;
	
	@RequestMapping(value="/newsmanager", method=RequestMethod.GET)
	ModelAndView addnews(ModelAndView modelAndView) {
		
		modelAndView.setViewName("app.newsmanager");
		
		News news = new News();
		
		List<News> allNews = newsService.listAll();
		

		//I AM REVERSING THE LIST SO THE FIRST DISPLAYED ARE THE NEWEST
		
		Collections.reverse(allNews);
		
		modelAndView.getModel().put("news", news);
		
		modelAndView.getModel().put("allNews", allNews);
		return modelAndView;
	}
	

	@RequestMapping(value="/newsmanager", method=RequestMethod.POST)
	ModelAndView addnews(ModelAndView modelAndView, News news) {
		
		
		modelAndView.setViewName("redirect:/newsmanager");
		//modelAndView.setViewName("app.newsmanager");
			
		newsService.add(news);
		
		News latestNews = newsService.getLatest();
		modelAndView.getModel().put("latestNews", latestNews);
		
		
		
		return modelAndView;
	}
	
	@RequestMapping(value="/newsmanager/delete{id}")
		public String removeNews(@PathVariable("id") Long id){
		
		newsService.delete(id);

		
		return "redirect:/newsmanager";
		
		
	}
	
}
