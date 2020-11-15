package com.filipmoszczynski.module.person;

import com.filipmoszczynski.module.utils.StringTatsuUtils;

import java.util.Objects;

public class PersonDto {

	private String name;
	private String surname;
	private String email;

	public PersonDto() {
	}

	public PersonDto(String name, String surname, String email) {
		this.name = name;
		this.surname = surname;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmail() {
		return email;
	}

	public boolean isEmailValid() {
		return StringTatsuUtils.isEmail(email);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PersonDto personDto = (PersonDto) o;
		return Objects.equals(name, personDto.name) &&
				Objects.equals(surname, personDto.surname) &&
				Objects.equals(email, personDto.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, surname, email);
	}
}
