package com.filipmoszczynski.module.books.service;

import com.filipmoszczynski.module.books.entity.BookEntity;
import com.filipmoszczynski.module.books.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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
		bookService.getOne(VALID_BOOK_ID);
		// then
		verify(bookRepository).getOne(VALID_BOOK_ID);
	}

	@Test
	public void shouldNotCallGetOneWhenIdIsValid() {
		// when
		bookService.getOne(NOT_VALID_BOOK_ID);
		// then
		verify(bookRepository, times(0)).getOne(NOT_VALID_BOOK_ID);
	}

	@Test
	public void shouldCallFindAll() {
		// when
		bookService.getAll();
		// then
		verify(bookRepository).findAll();
	}

	@Test
	public void shouldCallSaveAndFlash() {
		// when
		bookService.create(BOOK);
		// then
		verify(bookRepository).saveAndFlush(BOOK);
	}

	@Test
	public void shouldNotCallSaveAndFlashWhenObjectIsEqualToNull() {
		// when
		bookService.create(null);
		// then
		verify(bookRepository, times(0)).saveAndFlush(BOOK);
	}

	@Test
	public void shouldCallDeleteById() {
		// when
		bookService.delete(VALID_BOOK_ID);
		// then
		verify(bookRepository).deleteById(VALID_BOOK_ID);
	}

	@Test
	public void shouldSaveAndFlashInCaseOfUpdate() {
		// when
		bookService.update(VALID_BOOK_ID, BOOK);
		// then
		verify(bookRepository).saveAndFlush(BOOK);
	}
}