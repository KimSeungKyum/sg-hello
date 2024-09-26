package com.reo.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String helloPage(Model model) {
		model.addAttribute("greeting", "ㅎㅇㅎㅇㅎㅇㅎㅇㅎㅇ");
		return "hello";
	}
}
