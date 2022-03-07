package com.springboot.error.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String index() {
		//Integer numero = 100/0;
		Integer numerotrucho = Integer.parseInt("10x");
	return "index";	
	}
	
}
