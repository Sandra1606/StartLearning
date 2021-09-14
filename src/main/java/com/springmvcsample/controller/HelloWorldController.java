package com.springmvcsample.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvcsample.model.HelloWorld;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloworld")
	
public String handler(Model model) {
		
		HelloWorld helloWorld=new HelloWorld();
		helloWorld.setMessage("Hi");
		helloWorld.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("helloWorld",helloWorld);
		return "helloworldjsp";
		
		
	}
}
