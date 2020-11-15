package com.filipmoszczynski.module.person;

public class PersonEntity {

	private String name;
	private String surname;
	private String email;

	public String getName() {
		return name;
	}

	public PersonEntity setName(String name) {
		this.name = name;
		return this;
	}

	public String getSurname() {
		return surname;
	}

	public PersonEntity setSurname(String surname) {
		this.surname = surname;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public PersonEntity setEmail(String email) {
		this.email = email;
		return this;
	}
}
