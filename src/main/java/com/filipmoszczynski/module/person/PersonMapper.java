package com.filipmoszczynski.module.person;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonMapper {

	public static List<PersonDto> asList(List<PersonEntity> persons) {
		return persons
				.stream()
				.map(PersonMapper::map)
				.collect(Collectors.toList());
	}

	public static Set<PersonDto> asSet(List<PersonEntity> persons) {
		return asList(persons)
				.stream()
				.collect(Collectors.toSet());
	}

	public static PersonDto map(PersonEntity person) {
		if (person == null) {
			return null;
		}
		return new PersonDto(
				person.getName(),
				person.getSurname(),
				person.getEmail()
		);
	}
}
