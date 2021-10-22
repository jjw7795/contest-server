package com.eduNews.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/aaa")
	public String a() {
		return "hello";
	}
	
	@PostMapping("/post")
	public String b(String ba) {
		 System.out.println(ba);
		 System.out.println("zzzzzdfdfd");
	   	return "zzzzz";
	}

}
