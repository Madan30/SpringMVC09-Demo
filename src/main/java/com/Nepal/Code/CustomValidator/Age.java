package com.Nepal.Code.CustomValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {

	public String message() default "{invalidAgeMessage}";

	public int lower() default 18;

	public int upper() default 60;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
		