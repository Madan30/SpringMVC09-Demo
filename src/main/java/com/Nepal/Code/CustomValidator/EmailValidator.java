package com.Nepal.Code.CustomValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import come.NepalCode.api.UserRegisterInfoDTO;

public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegisterInfoDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"CommunicationDTO.email","email.empty","email cannot be blank");
		
		// wheather the emails is ending with gohimalayatrek.com
		String email = ((UserRegisterInfoDTO)target).getCommunicationDTO().getEmail();
		if(!email.endsWith("gohimalayatrek.com")) {
			errors.rejectValue("communicationDTO.email","email.invalidDomain");
		}
		

	}

}
