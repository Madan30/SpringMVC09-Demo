package com.NepalCode.Controllers;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import come.NepalCode.api.UserInfoDTO;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO, HttpServletRequest request) {

		/*
		 * // reading the existing property by fetching it from the dtp UserInfoDTO
		 * userInfo = new UserInfoDTO(); model.addAttribute("userInfo", userInfo);
		 * 
		 */
		
		Cookie [] cookies = request.getCookies();
		for(Cookie temp: cookies) {
			if("lcApp.userName".equals(temp.getName())) {
				
				String myUserName = temp.getValue();
				userInfoDTO.setUserName(myUserName);
			}
		}
		return "home-page";
	}

	@RequestMapping("/process-homePage")
	public String showResultPage(@Valid@ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result, HttpServletResponse response) {
		// @Valid annotation should always use before the @ModelAttribute and Bindingresult
		// should be after the DTO
		// otherwise it will give error
		// server side validation 
		if (result.hasErrors()) {
			//System.out.println("my form has errors");
			List<ObjectError> allErrors = result.getAllErrors();
			
			for(ObjectError temp: allErrors) {
				System.out.println(temp);
				
			}
			
			
			
			return "home-page";
		}

		/*
		 * // writing the value to the property by fetching from the url
		 * System.out.println("user name is: " + userInfoDTO.getUserName());
		 * System.out.println("crush name is: " + userInfoDTO.getCrushName());
		 * 
		 * //model.addAttribute("userInfo", userInfoDTO);
		 * 
		 */
		
		// create cookies
		 Cookie theCookie = new Cookie("lcApp.userName", userInfoDTO.getUserName());
		 theCookie.setMaxAge(60*60*24);
		 
		 // add the cookie to the response
		 
		 response.addCookie(theCookie);
		// write a service which will calculate the love % between the username and crushname
		
		
		return "result-page";
	}

}
