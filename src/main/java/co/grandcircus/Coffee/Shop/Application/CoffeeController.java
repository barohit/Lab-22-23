package co.grandcircus.Coffee.Shop.Application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {
	
	@RequestMapping("/")
	public ModelAndView mvGiver() {
		return new ModelAndView("Index");
	}
	
	@RequestMapping("userRegistration.html")
	public ModelAndView mvGiver2() {
		return new ModelAndView("userRegistration");
	}
	
	@RequestMapping("Response.html")
	public ModelAndView mvGiver3() {
		return new ModelAndView("Response"); 
	}

}
