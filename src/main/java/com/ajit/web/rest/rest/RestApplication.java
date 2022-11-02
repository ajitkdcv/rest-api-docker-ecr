package com.ajit.web.rest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class RestApplication {
	
	
	  @Autowired
	  private Environment environment;
	
	 @RequestMapping("/home/{name}")
	  public String home(@PathVariable String name) {
	    return "Welcome " + name + " port " + Integer.parseInt(environment.getProperty("local.server.port")));
	  }
	 
	 @RequestMapping("/check")
	  public String check(@RequestParam String name) {
	    return "Hello, you are there in DB " + name;
	  }
	 
	 
	 @RequestMapping("/product")
	  public String product(@RequestParam String name) {
	    return "Hello, you are there in DB " + name;
	  }
	 
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}
}
