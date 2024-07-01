package com.min.edu.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.min.edu.service.IEmpService;
import com.min.edu.vo.EmpInfoVo;

@Controller
public class HomeController {

	@Autowired
	private IEmpService service;
	
	@GetMapping(value = "/home.do")
	public String home() {
		return "home";
	}
	
	@GetMapping(value = "/empinfo.do")
	public String info(Model model) {
		List<EmpInfoVo> list = service.selectAllInfo();
		model.addAttribute("list", list);
		return "info";
	}
	
	
	
	
}
