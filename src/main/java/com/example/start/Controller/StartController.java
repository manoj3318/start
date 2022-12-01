package com.example.start.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
	
	@RequestMapping(value = "/")
	public String printMessage()
	{
		return "Hello World!";
	}
}
