package com.tosm.TosMData.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value = {"", "/"})
	public String main(Model model) {
		
		model.addAttribute("title", "메인화면");
		
		return "main";
	}
	
}
