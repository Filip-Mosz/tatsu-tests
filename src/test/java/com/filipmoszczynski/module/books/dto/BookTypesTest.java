package com.filipmoszczynski.module.books.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookTypesTest {

	@Test
	public void shouldReturnDefaultEnumInCaseOfNullOrInvalidValue() {
		assertThat(BookTypes.byString(null)).isEqualTo(BookTypes.CLASSIC);
		assertThat(BookTypes.byString("thriller")).isEqualTo(BookTypes.CLASSIC);
		assertThat(BookTypes.byString("")).isEqualTo(BookTypes.CLASSIC);
	}

	@Test
	public void shouldReturnEnumByString() {
		assertThat(BookTypes.byString("HORROR")).isEqualTo(BookTypes.HORROR);
		assertThat(BookTypes.byString("ACTION")).isEqualTo(BookTypes.ACTION);
		assertThat(BookTypes.byString("FANTASY")).isEqualTo(BookTypes.FANTASY);
		assertThat(BookTypes.byString("CLASSIC")).isEqualTo(BookTypes.CLASSIC);

	}
	@Test
	public void shouldReturnEnumByStringAndIgnoreCase() {
		assertThat(BookTypes.byString("hoRRor")).isEqualTo(BookTypes.HORROR);
		assertThat(BookTypes.byString("Action")).isEqualTo(BookTypes.ACTION);
		assertThat(BookTypes.byString("fantaSy")).isEqualTo(BookTypes.FANTASY);
		assertThat(BookTypes.byString("ClassIc")).isEqualTo(BookTypes.CLASSIC);
	}

}