package com.filipmoszczynski.module.utils;

import java.util.List;

public class CollectionTatsuUtils {

	public static List<String> getListOfColorsPerType(String type) {
		if (StringTatsuUtils.isBlank(type)) {
			return List.of();
		}
		switch (type) {
			case "TYPE_1":
				return List.of("red", "blue", "green");
			case "TYPE_2":
				return List.of("black", "white");
			default:
				return List.of();
		}
	}

}
