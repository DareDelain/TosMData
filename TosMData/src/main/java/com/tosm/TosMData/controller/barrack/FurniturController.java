package com.tosm.TosMData.controller.barrack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/barrack")
public class FurniturController {
	
	@GetMapping("/furnitur")
	public String funitur(Model model) {
		
		model.addAttribute("title", "가구 정보");
		
		return "barrack/furnitur";
	}
	
}
