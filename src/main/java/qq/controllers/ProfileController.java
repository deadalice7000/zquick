package qq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProfileController {

	@RequestMapping("/profile")
	ModelAndView home(ModelAndView modelAndView, @RequestParam(value = "p", required=false) String p) {

		modelAndView.setViewName("app.profile");

		
		
		return modelAndView;

	}
	
	
	
	
}
