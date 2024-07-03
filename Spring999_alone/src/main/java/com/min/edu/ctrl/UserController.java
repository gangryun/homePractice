package com.min.edu.ctrl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.min.edu.service.IUserService;
import com.min.edu.vo.UserVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class UserController {


	private final IUserService service;
	
	@GetMapping(value = "/loginIntro.do")
	public String loginForm() {
		log.info("UserController login GET");
		return "loginForm";
	}
	
	
	@GetMapping(value = "/registUser.do")
	public String registForm() {
		return "registUserForm";
	}
	
	
	@GetMapping(value = "/index.do")
	public String index(Model model) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		model.addAttribute("list", list);
		return "main";
	}
	
	
	@GetMapping(value = "/findIdPage.do")
	public String findId() {
		return "findId";
	}
	
	
	
}
