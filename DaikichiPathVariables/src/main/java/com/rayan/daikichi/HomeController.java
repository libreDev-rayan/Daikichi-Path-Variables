package com.rayan.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	@RestController

	@RequestMapping("/daikichi")
	public class HomeController {


		 @RequestMapping("/travel/{city}")
	     public String hello(@PathVariable("city")String city) { // 3
	             
			 return "Congatulations! You will soon travel to "
	    		 				+city;
	     }
		 
		 @RequestMapping("/lotto/{num}")
	    
	     public String helloNew(@PathVariable("num") Integer number) { // 3
	        if(number %2 == 0) {
	        	return "You will take a grand journey in the near future, "
	        			+ "but be weary of tempting offers";
	        }else {
	        	return "You have enjoyed the fruits of your labor but now is a great time to spend time "
	        			+ "with family and friends.";
	        }
	    }
}

