package com.filipmoszczynski.module.books.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "books_tags")
@JsonIgnoreProperties("book")
public class BooksTagsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "book_id")
	private BookEntity book;

	private String value;

	public BookEntity getBook() {
		return book;
	}

	public BooksTagsEntity setBook(BookEntity book) {
		this.book = book;
		return this;
	}

	public String getValue() {
		return value;
	}

	public BooksTagsEntity setValue(String value) {
		this.value = value;
		return this;
	}
}
