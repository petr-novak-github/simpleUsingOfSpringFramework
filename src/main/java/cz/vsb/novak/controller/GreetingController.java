package cz.vsb.novak.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class GreetingController {
	
@RequestMapping("/hello")
	
	String hello() {
		
		return "<b>Hello gggg world</b>";
	}

}
