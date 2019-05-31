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
	public ModelAndView registrationForm() {
		return new ModelAndView("userRegistration");
	}
	
	
	@RequestMapping("/resp")
	public ModelAndView addUser(User user) { 
		cd.addUser(user.getFirstname(), user.getLastname(), user.getEmail(), user.getPassword(), user.getPhoneNumber(), user.getFavoriteCoffee(), user.getPreferredFlavors(), user.getFavoriteMajorChain(), user.getJoinReasons()); 
		return new ModelAndView("Response"); 
	}
	
	@RequestMapping("/admin")
	public ModelAndView getallItems() {
		List<Item> l = cd.findAllItems();
		return new ModelAndView("Adminform", "items", l);
	}

	@RequestMapping("/update")
	public ModelAndView editItem(@RequestParam("item") String item) {
		return new ModelAndView("editpage", "item", item);
	}

	@RequestMapping("/returntoadmin")
	public ModelAndView editItem2(@RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("price") Double price, @RequestParam("quantity") Integer quantity, @RequestParam("itemID") Integer itemID)  {
		cd.updateItem(name, description, price, quantity, itemID);
		List<Item> l = cd.findAllItems(); 
		return new ModelAndView("Adminform", "items", l);
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteItem(@RequestParam("item") Integer item) {
		cd.deleteItem(item); 
		List<Item> l = cd.findAllItems(); 
		return new ModelAndView("Adminform", "items", l);
	}
	
	@RequestMapping("/addnew")
	public ModelAndView addItem( ) {
		return new ModelAndView("addpage"); 
	}
	
	@RequestMapping("/additem")
	public ModelAndView addItem2(@RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("price") Double price, @RequestParam("quantity") Integer quantity)  {
		cd.addItem(name, description, price, quantity);
		List<Item> l = cd.findAllItems(); 
		return new ModelAndView("Adminform", "items", l);
	}
}
	


