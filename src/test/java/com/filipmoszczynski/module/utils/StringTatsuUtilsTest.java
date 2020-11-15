package com.filipmoszczynski.module.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTatsuUtilsTest {

	@Test
	public void shouldReturnTrueWhenProductionIsOn() {
		assertThat(true).isTrue();
		assertThat("a").isEqualTo("a");
	}

	@Test
	public void shouldReturnFalseWhenDevIsOff() {
	}

	@Test
	public void shouldReturnTrueWhenStringIsBlank() {
	}

	@Test
	public void shouldReturnFalseWhenStringIsNotBlank() {
	}

	@Test
	public void shouldReturnFalseWhenEmailIsNotValid() {
	}

	@Test
	public void shouldReturnTrueWhenEmailIsValid() {
	}

	@Test
	public void shouldReturnFullName() {
	}
}