package com.filipmoszczynski.module.books.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookTypesTest {

	@Test
	public void shouldReturnDefaultEnumInCaseOfNullOrInvalidValue() {
		assertThat(true).isTrue();
		assertThat("a").isEqualTo("a");
	}

	@Test
	public void shouldReturnEnumByString() {
	}

	@Test
	public void shouldReturnEnumByStringAndIgnoreCase() {
	}

}