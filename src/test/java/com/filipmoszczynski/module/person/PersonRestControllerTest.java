package com.filipmoszczynski.module.person;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PersonRestControllerTest {

	@Autowired
	private PersonRestController personRestController;

	@Test
	public void shouldReturnController() {
		assertThat(personRestController).isNotNull();
		assertThat(personRestController.getPerson()).isNotNull();
		assertThat(personRestController.getPerson().getName()).isEqualTo("Michał");
		assertThat(personRestController.getPerson().getSurname()).isEqualTo("Szałkowski");
		assertThat(personRestController.getPerson().getEmail()).isEqualTo("admin@michalszalkowski.com");
	}
}