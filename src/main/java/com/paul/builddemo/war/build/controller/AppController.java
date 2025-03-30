package com.paul.builddemo.war.build.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@RequestMapping("/")
    public String index() {
        return "index";  // This should map to 'index.html' or return a simple response
    }
	
	@GetMapping("/home")
	public String home() {
		return "This project is for demo on how to build using CI and CD pipelines";
	}

}
