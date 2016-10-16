package qq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import qq.model.StatusUpdate;
import qq.service.StatusUpdateService;

@Controller
public class PageController {
	
	@Autowired
	private StatusUpdateService statusUpdateService;
	
	@RequestMapping("/")
	String home() {
		return "app.homepage";
	}

	@RequestMapping("/about")
	String about() {
		return "app.about";
	}

	// MODEL CZYLI INFORMACJE Z FORMULARZA

	@RequestMapping(value = "/addstatus", method = RequestMethod.GET)
	ModelAndView addStatus(ModelAndView modelAndView) {

		// SET VIEW - PRZEKIEROWANIE DO WIDOKU
		modelAndView.setViewName("app.addStatus");

		StatusUpdate statusUpdate = new StatusUpdate();
		
		StatusUpdate latestStatusUpdate = statusUpdateService.getLatest();

		// MAPUJE MODEL DO OBIEKTU STATUSUPDATE XD
		modelAndView.getModel().put("statusUpdate", statusUpdate);
		modelAndView.getModel().put("latestStatusUpdate", latestStatusUpdate);

		return modelAndView;
	}

	@RequestMapping(value = "/addstatus", method = RequestMethod.POST)
	ModelAndView addStatus(ModelAndView modelAndView, StatusUpdate statusUpdate) {

		// SET VIEW - PRZEKIEROWANIE DO WIDOKU
		modelAndView.setViewName("app.addStatus");

		
		statusUpdateService.save(statusUpdate);
		
		StatusUpdate latestStatusUpdate = statusUpdateService.getLatest();
		modelAndView.getModel().put("latestStatusUpdate", latestStatusUpdate);
		
		return modelAndView;
	}
}
