package com.min.edu.ctrl;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.min.edu.service.IUserService;
import com.min.edu.vo.UserVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserRestController {

	private final IUserService service;
	
	@PostMapping(value = "/duplicateId.do")
	public String duplicate(String id) {
		log.info("화면에서 받은 값 : {}", id);
 		int checkId = service.duplicateId(id);
		
		return checkId>0?"true":"false";
	}
	
	
	@PostMapping(value = "/login.do")
	public String login(@RequestParam Map<String, Object> map) {
		log.info("UserController login POST");
		log.info("전달값 :{}", map);
		UserVo loginVo = service.getLogin(map);
		String msg = "";
		if(loginVo == null) {
			msg = "N";
		} else {
			msg = "Y";
		}
		return msg;
	}
	
	
	@GetMapping(value = "/findId.do")
	public String findId(@RequestParam Map<String, String> map) {
		log.info("dd {}",map);
		String name = map.get("name");
		String phone = map.get("phone");
		String email = map.get("email");
		UserVo vo = new UserVo();
		
		log.info(email);
		if(name == null || name == "") {
			vo.setEmail(email);
		} 
		
		if(email == null || email == "") {
			vo.setName(name);
			vo.setPhone(phone);
		}
		
		String id = service.findId(vo);
		return id;
	}
	
	
}	
