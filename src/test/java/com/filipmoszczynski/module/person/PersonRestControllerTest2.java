package com.filipmoszczynski.module.person;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonRestControllerTest2 {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void shouldReturnPerson() {
		// given
		String url = "http://localhost:" + port  + "/api/person/1";
		// when
		PersonDto response = this.restTemplate.getForObject(url, PersonDto.class);
		// then
		assertThat(response.getName()).isEqualTo("Michał");
		assertThat(response.getSurname()).isEqualTo("Szałkowski");
		assertThat(response.getEmail()).isEqualTo("admin@michalszalkowski.com");
	}

	@Test
	public void shouldReturnListOfPersons() {
		// given
		String url = "http://localhost:" + port + "/api/person/";
		// when
		List<PersonDto> response = List.of(this.restTemplate.getForObject(url, PersonDto[].class));
		// then
		assertThat(response)
				.isNotEmpty()
				.hasSize(2);
		assertThat(response.get(0).getName()).isEqualTo("Michał");
	}

}
