package com.kenya.fruityloops.controllers;

// ======= Request Mapping =============
import org.springframework.web.bind.annotation.RequestMapping;
// ======= Controller ==================
import org.springframework.stereotype.Controller;
// ======= Model =======================
import org.springframework.ui.Model;
import java.util.ArrayList;



@Controller
public class ItemController {
	 @RequestMapping("/")
	    public String index(Model model) {
	        
	        ArrayList<Item> fruits = new ArrayList<Item>();
	        fruits.add(new Item("Kiwi", 1.5));
	        fruits.add(new Item("Mango", 2.0));
	        fruits.add(new Item("Goji Berries", 4.0));
	        fruits.add(new Item("Guava", .75));
	        
	        // Add fruits your view model here
	        model.addAttribute("fruitsName",fruits);
	        return "index.jsp";
	    }

}
