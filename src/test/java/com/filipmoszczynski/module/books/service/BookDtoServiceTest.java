package com.filipmoszczynski.module.books.service;

import com.filipmoszczynski.module.books.entity.BookEntity;
import com.filipmoszczynski.module.books.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BookDtoServiceTest {

	private static final long BOOK_ID = 1;
	private static final BookEntity BOOK_ENTITY = new BookEntity()
			.setId(BOOK_ID);

	@Mock
	private BookRepository bookRepository;

	@InjectMocks
	private BookDtoService bookDtoService;

	@Test
	public void shouldNotReturnBook() {
		// given
		// when
		// then
	}

	@Test
	public void shouldReturnBook() {
		// given
		// when
		// then
	}

	@Test
	public void shouldReturnEmptyList() {
		// given
		// when
		// then
	}

	@Test
	public void shouldReturnList() {
		// given
		// when
		// then
	}
}