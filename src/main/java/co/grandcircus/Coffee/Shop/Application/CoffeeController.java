package co.grandcircus.Coffee.Shop.Application;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {
	
	List<Item> items = new ArrayList<Item>(); 
	CoffeeDao cd = new CoffeeDao(); 
	int hazelnutLatteCount = 0; 
	int vanillaLatteCount = 0; 
	
	@RequestMapping("/")
	public ModelAndView mvGiver() {
		return new ModelAndView("Index");
	}
	
	@RequestMapping("/userRegistration")
	public ModelAndView mvGiver2() {
		return new ModelAndView("userRegistration");
	}
	
	@RequestMapping("/resp")
	public ModelAndView mvGiver3(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, @RequestParam("pass") String password, @RequestParam("email") String email, @RequestParam("phonenumber") String phoneNumber) {
		cd.addUser(firstname, lastname, email, password, phoneNumber); 
		return new ModelAndView("Response"); 
	}
	
	@RequestMapping("/result")
	public ModelAndView order(@RequestParam("item") String item) {
		int quant = 0; 
		String description = ""; 
		double price = 0.0; 
		if (item.equals("hazelnut latte")) {
			hazelnutLatteCount++; 
			quant = hazelnutLatteCount;
			description = "hazelnut flavored latte";
			price = 2.99; 
		} else if (item.contentEquals("vanillaLatteCount")) {
			quant = vanillaLatteCount; 
			description = "vanilla flavored latte"; 
			vanillaLatteCount++; 
			price = 6.99;
		}
		
		cd.addItem(item, price, description, quant);
		return new ModelAndView("result", "item", item);
	}

}
