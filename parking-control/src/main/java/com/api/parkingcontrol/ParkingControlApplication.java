package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ParkingControlApplication {

	public static void main(String[] args) {SpringApplication.run(ParkingControlApplication.class, args);}

	@GetMapping("/")
	public String greetingMessage(){
		return "Hello, world!";
	}

}

/*
#########		Spring DispatcherServlet   ##########
- Simply put, in the Front Controller design pattern, a single controller is responsible for directing incoming HttpRequests
 	to all of an application’s other controllers and handlers.
	Spring’s DispatcherServlet implements this pattern and is, therefore, responsible for correctly coordinating the HttpRequests
	to their right handlers.
	In this article, we will examine the Spring DispatcherServlet’s request processing workflow and how to implement
	several of the interfaces that participate in this workflow.

	link: https://www.baeldung.com/spring-dispatcherservlet
 */