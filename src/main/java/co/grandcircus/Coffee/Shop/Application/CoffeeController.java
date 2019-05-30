package co.grandcircus.Coffee.Shop.Application;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {
	
	List<Item> items = new ArrayList<Item>(); 
	
	@Autowired
	CoffeeDao cd; 
	 
	
	@RequestMapping("search")
	public ModelAndView find(@RequestParam("searchname") String name) {
		
		List<Item> l  = cd.findItem(name); 
			return new ModelAndView("result", "items", l);
	}
		
	
	@RequestMapping("/")
	 public ModelAndView mvGiver() {
	
		items = cd.findAllItems(); 
		List<Item> hazelLoc = cd.findLoc("hazelnut latte");  
		List <Item> vanillaLoc = cd.findLoc("vanilla latte");
		ModelAndView mv = new ModelAndView("Index"); 
		mv.addObject("items", items); 
		mv.addObject("hazelnutlatte", hazelLoc); 
		mv.addObject("vanillalatte", vanillaLoc);
		return mv; 
	}
	
	@RequestMapping("/userRegistration")
	public ModelAndView mvGiver2() {
		return new ModelAndView("userRegistration");
	}
	
//	@RequestMapping("/resp")
//	public ModelAndView mvGiver3(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, @RequestParam("pass") String password, @RequestParam("email") String email, @RequestParam("phonenumber") String phoneNumber) {
//		User user = new User(firstname, lastname, email, password, phoneNumber); 
//		cd.addUser(user.getFirstname(), user.getLastname(), user.getEmail(), user.getPassword(), user.getPhoneNumber()); 
//		return new ModelAndView("Response"); 
//	}
	
	@RequestMapping("/resp")
	public ModelAndView mvGiver3(User user) { 
		cd.addUser(user.getFirstname(), user.getLastname(), user.getEmail(), user.getPassword(), user.getPhoneNumber(), user.getFavoriteCoffee(), user.getPreferredFlavors(), user.getFavoriteMajorChain(), user.getJoinReasons()); 
		return new ModelAndView("Response"); 
	}
	
	

}
