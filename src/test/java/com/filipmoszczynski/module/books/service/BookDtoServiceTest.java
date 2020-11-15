package com.filipmoszczynski.module.books.service;

import com.filipmoszczynski.module.books.dto.BookDto;
import com.filipmoszczynski.module.books.entity.BookEntity;
import com.filipmoszczynski.module.books.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

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
		Mockito.when(bookRepository.getOne(BOOK_ID)).thenReturn(null);
		// when
		Optional<BookDto> bookDto = bookDtoService.findOne(BOOK_ID);
		// then
		assertThat(bookDto).isNotPresent();
	}

	@Test
	public void shouldReturnBook() {
		// given
		Mockito.when(bookRepository.getOne(BOOK_ID)).thenReturn(BOOK_ENTITY);
		// when
		Optional<BookDto> bookDto = bookDtoService.findOne(BOOK_ID);
		// then
		assertThat(bookDto)
				.isPresent()
				.hasValueSatisfying(book -> {
					assertThat(book.getId()).isEqualTo(BOOK_ID);
				});
	}

	@Test
	public void shouldReturnEmptyList() {
		// given
		Mockito.when(bookRepository.findAll()).thenReturn(List.of());
		// when
		List<BookDto> booksDto = bookDtoService.getAll();
		// then
		assertThat(booksDto).isEmpty();
	}

	@Test
	public void shouldReturnList() {
		// given
		Mockito.when(bookRepository.findAll()).thenReturn((List<BookEntity>) List.of(
				new BookEntity().setId(2L),
				new BookEntity().setId(3L)
		));
		// when
		List<BookDto> booksDto = bookDtoService.getAll();
		// then
		assertThat(booksDto).isNotEmpty();
	}
}