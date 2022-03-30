package com.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("/openShift")
public class OpenShiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenShiftApplication.class, args);
	}

	@GetMapping("/{name}")
	public String getMsg(@PathVariable String name) {
		return "Hello " + name + " ! Welcome to Openshift";
	}

	@GetMapping("/")
	public String getMsg() {
		return "Hello! Welcome to Openshift......";
	}
}
