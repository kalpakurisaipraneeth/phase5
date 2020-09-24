package com.demo.c;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mc {
	@GetMapping("/test")
	public String getData()
	{
		return "Continuous Monitoring on Docker";
	}

	
}
