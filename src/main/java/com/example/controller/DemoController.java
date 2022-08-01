package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(value = "/")
	public String method1()
	{
		return ("Hi");
	}
	
	System.out.println("hi");
	
	@RequestMapping(value = "/hi")
	public String method2()
	{
		return ("hi hi");
	}
	
}
