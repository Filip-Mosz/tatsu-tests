package com.filipmoszczynski.module.utils;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionTatsuUtilsTest {


		List<String> list1 = List.of("red", "blue", "green");
		List<String> list2 = List.of("black", "white");


	@Test
	public void shouldReturnEmptyListWhenTypeIsNotValid() {
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("not-valid")).isEmpty();

		assertThat(CollectionTatsuUtils.getListOfColorsPerType(null)).isNullOrEmpty();

		assertThat(CollectionTatsuUtils.getListOfColorsPerType("TYPE_3")).hasSize(0);

		assertThat(CollectionTatsuUtils.getListOfColorsPerType("")).isEmpty();
	}

	@Test
	public void shouldReturnFirstGroupOfColors() {
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("TYPE_1")).isEqualTo(list1);
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("TYPE_1")).contains("blue");
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("TYPE_1")).contains("red");
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("TYPE_1")).contains("green");
	}

	@Test
	public void shouldReturnSecondGroupOfColors() {
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("TYPE_2")).isEqualTo(list2);
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("TYPE_2")).contains("black");
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("TYPE_2")).contains("white");
	}
}