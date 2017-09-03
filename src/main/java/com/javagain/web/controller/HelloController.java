package com.sstechy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Sandeep.Sharma
 *
 */
@Controller
@RequestMapping("/")
public class HelloController {

	/**
	 * Show user page
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "user", method = RequestMethod.GET)
	public String  userPage(Model model) {
		// Set attribute on model
		model.addAttribute("title", "Spring Security Hello World");
		model.addAttribute("message", "This is not protected page - User Page!");
		// Return view name
		return "user";
	}
	
	
	@RequestMapping(value = "admin", method = RequestMethod.GET)
	public String  adminPage(Model model) {
		// Set attribute on model
		model.addAttribute("title", "Spring Security Hello World");
		model.addAttribute("message", "This is protected page - Admin Page!");
		// Return view name
		return "admin";
	}
	
	@RequestMapping(value = "logoutSuccess", method = RequestMethod.GET)
	public String  logoutSuccess() {		
		return "logoutSuccess";
	}
}
