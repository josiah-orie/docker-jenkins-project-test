package com.project.docker_jenkins_project_test.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/")
	public String home() {

		return "Welcome Josiah to Project Test 1";
	}
}
