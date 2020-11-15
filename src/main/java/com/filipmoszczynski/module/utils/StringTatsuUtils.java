package com.filipmoszczynski.module.utils;

import java.util.regex.Pattern;

public class StringTatsuUtils {

	public static boolean isProductionState() {
		return true;
	}

	public static boolean isDevState() {
		return false;
	}

	public static boolean isBlank(String value) {
		return value == null || value.trim().equalsIgnoreCase("");
	}

	public static boolean isEmail(String email) {
		if(isBlank(email)) {
			return false;
		}
		return Pattern.compile(
				"^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE).matcher(email).find();
	}

	public static String getFullName(String name, String surname) {
		if (name != null) {
			name = name.trim();
		}
		if (surname != null){
			surname = surname.trim();
		}
		if (isBlank(name) && isBlank(surname)) {
			return "";
		}
		if (isBlank(name)) {
			return surname;
		}
		if (isBlank(surname)) {
			return name;
		}
		return String.format("%s %s", name, surname);
	}
}
