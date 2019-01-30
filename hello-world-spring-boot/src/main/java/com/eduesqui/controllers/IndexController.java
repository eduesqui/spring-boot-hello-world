package com.eduesqui.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@Value("${view.message.hello}")
	private String helloMessage;

	@GetMapping("/")
	public String helloWorld(Model model) {
		model.addAttribute("message", helloMessage);
		return "helloWorld";
	}
	
	
}
