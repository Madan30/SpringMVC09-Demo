package com.NepalCode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import come.NepalCode.api.EmailDTO;

@Controller
public class EmailController {

	@RequestMapping("/sendEmail")
	public String sendEmail(@CookieValue("lcApp.userName")String userName, @ModelAttribute("emailDTO") EmailDTO eamilDTO, Model model) {
		
		model.addAttribute("userName", userName);
		//model.addAttribute("emailDTO", new EmailDTO());
		//model.addAttribute("userName", userName.toUpperCase());
		return "send-email-page";
	}

	@RequestMapping("/process-email")
	public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		return "process-email-page";
	}

}
