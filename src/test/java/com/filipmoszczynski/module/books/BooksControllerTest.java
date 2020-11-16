package com.filipmoszczynski.module.books;

import com.filipmoszczynski.module.books.dto.BookDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BooksControllerTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void shouldReturnPerson() {
		// given
		String url = "http://localhost:" + port + "/api/books/1";
		// when
		ResponseEntity<BookDto> response = this.restTemplate.getForEntity(url, BookDto.class);
		// then
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody().getId()).isEqualTo(1);
		assertThat(response.getBody().getAuthor()).isEqualTo("J.R.R. Tolkien");
		assertThat(response.getBody().getTitle()).isEqualTo("The Lord Of The Rings");
		assertThat(response.getBody().getDetails().getIsbn()).isEqualTo("0001");
		assertThat(response.getBody().getDetails().getLang()).isEqualTo("EN");
		assertThat(response.getBody().getTags()).contains("dolor", "lorem", "ipsum", "consectetur");
	}

	@Test
	public void shouldReturnPersons() {
		// given
		String url = "http://localhost:" + port + "/api/books/";
		// when
		ResponseEntity<BookDto[]> response = this.restTemplate.getForEntity(url, BookDto[].class);
		// then
		List<BookDto> body = List.of(response.getBody());
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(body.size()).isEqualTo(3);
		assertThat(body.get(0).getId()).isEqualTo(1);
		assertThat(body.get(0).getAuthor()).isEqualTo("J.R.R. Tolkien");
		assertThat(body.get(0).getTitle()).isEqualTo("The Lord Of The Rings");
		assertThat(body.get(0).getDetails().getIsbn()).isEqualTo("0001");
		assertThat(body.get(0).getDetails().getLang()).isEqualTo("EN");
		assertThat(body.get(0).getTags()).contains("dolor", "lorem", "ipsum", "consectetur");
	}


}