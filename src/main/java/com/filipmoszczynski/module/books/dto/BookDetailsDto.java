package com.filipmoszczynski.module.books.dto;

public class BookDetailsDto {

	private String isbn;
	private String lang;

	public String getIsbn() {
		return isbn;
	}

	public BookDetailsDto setIsbn(String isbn) {
		this.isbn = isbn;
		return this;
	}

	public String getLang() {
		return lang;
	}

	public BookDetailsDto setLang(String lang) {
		this.lang = lang;
		return this;
	}

}
