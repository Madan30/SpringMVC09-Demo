package com.NepalCode.Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import come.NepalCode.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {

		System.out.println("inside the print formatter method");

		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

		// parse method helps to convert one data to another data
		System.out.println("Inside the parse method of the phoneNumberFormatter");

		Phone phone = new Phone();
		// logic
		// split the string recived from the user
		String[] phoneNumberArray = completePhoneNumber.split("-");

		// whether the number consists of -
		int index = completePhoneNumber.indexOf('-');
		if (index == -1 || completePhoneNumber.startsWith("-")) {

			// if the '-' is not found, then add 977 as the default country code
			phone.setCountryCode("+977");
			// phone.setUserNumber(phoneNumberArray[0]);

			if (completePhoneNumber.startsWith("-")) {
				phone.setUserNumber(phoneNumberArray[1]);

			}

			else {
				phone.setUserNumber(phoneNumberArray[0]);
			}
		}

		else {

			// Extract the countryCode and set it to the phone class countryCodeProperty
			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);

		}

		return phone;
	}

}
