package com.filipmoszczynski.module.person;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonDtoTest {

	private static final String NAME = "Michał";
	private static final String SURNAME = "Szałkowski";
	private static final String EMAIL = "no@michalszalkowski.com";

	@Test
	public void shouldReturnEmptyObject() {
		// given
		// when
		PersonDto emptyPerson = new PersonDto();
		// then
		assertThat(emptyPerson.getName()).isNull();
		assertThat(emptyPerson.getEmail()).isNull();
		assertThat(emptyPerson.getSurname()).isNull();
		assertThat(emptyPerson.isEmailValid()).isFalse();
	}

	@Test
	public void shouldReturnPerson() {
		// given
		// when
		PersonDto validPerson = new PersonDto(NAME, SURNAME, EMAIL);
		// then
		assertThat(validPerson.getSurname())
				.isNotNull()
				.isEqualTo(SURNAME);

		assertThat(validPerson.getName())
				.isEqualTo(NAME)
				.isNotNull();

		assertThat(validPerson.getEmail())
				.isNotNull()
				.isEqualTo(EMAIL);

		assertThat(validPerson.isEmailValid())
				.isTrue();
	}
}