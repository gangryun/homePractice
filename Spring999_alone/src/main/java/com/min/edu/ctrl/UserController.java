package com.min.edu.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class UserController {


	@GetMapping(value = "/login.do")
	public String loginForm() {
		log.info("UserController login GET");
		return "loginForm";
	}
	
	@PostMapping(value = "/login.do")
	public String login() {
		log.info("UserController login POST");
		return null;
	}
	
	@GetMapping(value = "/registUser.do")
	public String registForm() {
		return "registUserForm";
	}
	
	
	
}
