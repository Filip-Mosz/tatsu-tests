package com.filipmoszczynski.module.books.mapper;

import com.filipmoszczynski.module.books.entity.BooksTagsEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class BookTagsMapper {

	public static String map(BooksTagsEntity tag) {
		return tag.getValue();
	}

	public static Set<String> map(Set<BooksTagsEntity> tags) {
		if(tags == null) {
			return Set.of();
		}
		return tags
				.stream()
				.map(BookTagsMapper::map)
				.collect(Collectors.toSet());
	}
}
