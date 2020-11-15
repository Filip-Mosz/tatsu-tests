package com.filipmoszczynski.module.books.service;

import com.filipmoszczynski.module.books.entity.BookEntity;
import com.filipmoszczynski.module.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public BookEntity getOne(Long id) {
		if (id == null || id == 0) {
			return null;
		}
		return bookRepository.getOne(id);
	}

	public List<BookEntity> getAll() {
		return bookRepository.findAll();
	}

	public BookEntity create(BookEntity entity) {
		if (entity == null) {
			return null;
		}
		return bookRepository.saveAndFlush(entity);
	}

	public void delete(Long id) {
		bookRepository.deleteById(id);
	}

	public BookEntity update(Long id, BookEntity entity) {
		return bookRepository.saveAndFlush(entity.setId(id));
	}
}
