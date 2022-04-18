package com.Nepal.Code.CustomValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import come.NepalCode.api.UserRegisterInfoDTO;

public class UserNameValidator implements Validator {

	// check if the userNameValidato supports a given object
	@Override
	public boolean supports(Class<?> clazz) {
	
		return UserRegisterInfoDTO.class.equals(clazz);
	}

	// we need to write our custom validation logic
	@Override
	public void validate(Object target, Errors errors) {
		
		// to check if the field is null
		// use valitationutils
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty", "User name cannot be empty");
		
		
		
		
	}

}
