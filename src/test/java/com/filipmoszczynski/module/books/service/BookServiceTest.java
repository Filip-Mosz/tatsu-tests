package com.filipmoszczynski.module.books.service;

import com.filipmoszczynski.module.books.entity.BookEntity;
import com.filipmoszczynski.module.books.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

	private static final long VALID_BOOK_ID = 1;
	private static final long NOT_VALID_BOOK_ID = 0;
	private static final BookEntity BOOK = new BookEntity();

	@Mock
	private BookRepository bookRepository;

	@InjectMocks
	private BookService bookService;

	@Test
	public void shouldCallGetOneWhenIdIsValid() {
		// when
		// then
	}

	@Test
	public void shouldNotCallGetOneWhenIdIsValid() {
		// when
		// then
	}

	@Test
	public void shouldCallFindAll() {
		// when
		// then
	}

	@Test
	public void shouldCallSaveAndFlash() {
		// when
		// then
	}

	@Test
	public void shouldNotCallSaveAndFlashWhenObjectIsEqualToNull() {
		// when
		// then
	}

	@Test
	public void shouldCallDeleteById() {
		// when
		// then
	}

	@Test
	public void shouldSaveAndFlashInCaseOfUpdate() {
		// when
		// then
	}
}