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
	}

}