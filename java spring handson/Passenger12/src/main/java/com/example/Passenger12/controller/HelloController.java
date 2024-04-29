package com.example.Passenger12.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller("helloController")
@Scope("request")
@RequestMapping("/hello")
public class HelloController {
 
	    @RequestMapping(method = RequestMethod.GET)  // This is a Get method
	    /*
	    public String printHello() 
	    { 
		    return "Display.jsp";	 // Return type is String which is a jsp file
		}
	   // Here there is only 1 method inside the controller so when user make request for /hello it will 
	   // print the content from Display.jsp file
		*/
	   //This method returns Model and View
	        public ModelAndView printHello() {
 
	    	ModelAndView mav = new ModelAndView();
	    	mav.setViewName("hello");
	    	mav.addObject("message", "Hello Spring MVC Framework!");
	    	return mav;
	}
 
}