package com.min.edu.ctrl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.min.edu.service.IUserService;

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
	
	
}
