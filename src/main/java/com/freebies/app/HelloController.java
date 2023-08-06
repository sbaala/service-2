package com.freebies.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/service-2")
	public String hellloRest( ) {
		
		return "Hello World";
	}
	@GetMapping("/invokeservice")
	public String traverseCall() {
		return "invoked from Service-1 and return service-2";
	}
}
