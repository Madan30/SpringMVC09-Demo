package com.NepalCode.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Nepal.Code.CustomValidator.UserNameValidator;
import com.NepalCode.propertyEditor.NamePropertyEditor;

import come.NepalCode.api.CommunicationDTO;
import come.NepalCode.api.Phone;
import come.NepalCode.api.UserRegisterInfoDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String registerHome(@ModelAttribute("userReg") UserRegisterInfoDTO regDTO ) {
		
		System.out.println("Inside registerhome method");
		
		// load the save user data from the database
		Phone phone = new Phone();
		phone.setCountryCode("977");
		phone.setUserNumber("98181445147");
		
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		
		regDTO.setCommunicationDTO(communicationDTO);
			
		return "register-home-page";
	}
	
	@RequestMapping("/register-success")
	public String successRegister(@Valid @ModelAttribute("userReg") UserRegisterInfoDTO regDTO , BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("my page has errors");
			
		   List<ObjectError> allErrors = result.getAllErrors();
		   for(ObjectError error : allErrors) {
			   System.out.println(error);
		   }
		   
		   return "register-home-page";
		}
		
		//System.out.println("first name is " + regDTO.getFirstName());
		System.out.println("Inside register success method");
		
		return "register-succ-page";
	}
	
	// advance initbinder
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Inside the init binder method");
		//binder.setDisallowedFields("firstName");
		
		// StringTimmerEditor is used to converting white spaces to null. It checks the filed whether the field is empty or not.
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,"firstName", editor);
		
		NamePropertyEditor nameEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class,"firstName" , nameEditor);
		
		// UserNameValidator validator = new UserNameValidator();
		binder.addValidators(new UserNameValidator());
		//binder.addValidators(new EmailValidator());
		
	}

}
