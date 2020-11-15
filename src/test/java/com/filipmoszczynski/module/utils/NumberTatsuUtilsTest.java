package com.filipmoszczynski.module.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTatsuUtilsTest {

	@Test
	public void shouldReturnTrue() {
		assertThat(NumberTatsuUtils.isEven(2)).isTrue();
		assertThat(NumberTatsuUtils.isEven(4)).isTrue();
		assertThat(NumberTatsuUtils.isEven(6)).isTrue();
		assertThat(NumberTatsuUtils.isEven(0)).isTrue();

		assertThat(NumberTatsuUtils.isEven(10))
				.isTrue()
				.isNotNull(); //zaleta assertThat - klika case'ów na raz
	}

	@Test
	public void shouldReturnFalse() {
		assertThat(NumberTatsuUtils.isEven(11)).isFalse();
		assertThat(NumberTatsuUtils.isEven(41)).isFalse();
		assertThat(NumberTatsuUtils.isEven(69)).isFalse();
	}

	@Test
	public void shouldReturnSum() {
		assertThat(NumberTatsuUtils.add(1, 2)).isEqualTo(3);
		assertThat(NumberTatsuUtils.add(0, 0)).isEqualTo(0);
		assertThat(NumberTatsuUtils.add(1, 0)).isEqualTo(1);
		assertThat(NumberTatsuUtils.add(-1, 2)).isEqualTo(1);
		assertThat(NumberTatsuUtils.add(-1, -2)).isEqualTo(-3);
		assertThat(NumberTatsuUtils.add(10, 20)).isEqualTo(30);
	}
}