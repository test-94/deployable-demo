package org.javamonsterchick.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String home(){
		return "Your application has been deployed successfully";
	}

	@GetMapping("/{name}")
	public String home(@PathVariable String name){
		return "Hey Mr. " + name + " Your application has been deployed successfully";
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
