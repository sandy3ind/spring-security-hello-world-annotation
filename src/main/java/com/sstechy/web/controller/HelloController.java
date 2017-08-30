package com.sstechy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Sandeep.Sharma
 *
 */
@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping(value = "user", method = RequestMethod.GET)
	public String userPage(Model model) {
		// Adding attributes
		model.addAttribute("title", "Spring Security Hello World");
		model.addAttribute("message", "This is user page!");
		// Set view name
		return "hello";
	}
}
