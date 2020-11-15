package com.filipmoszczynski.module.books.mapper;

import com.filipmoszczynski.module.books.dto.BookDto;
import com.filipmoszczynski.module.books.entity.BookEntity;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.stream.Collectors;

public class BookMapper {

	public static BookDto map(BookEntity entity) {
		if (entity == null) {
			return null;
		}
		return new BookDto()
				.setId(entity.getId())
				.setAuthor(entity.getAuthor())
				.setTitle(entity.getTitle())
				.setDetails(BookDetailsMapper.map(entity.getDetails()))
				.setTags(BookTagsMapper.map(entity.getTags()));
	}

	public static List<BookDto> map(List<BookEntity> entities) {
		if (entities == null || entities.size() == 0) {
			return List.of();
		}
		return entities
				.stream()
				.map(BookMapper::map)
				.collect(Collectors.toList());
	}

	public static List<BookDto> map(Page<BookEntity> pageObject) {
		return map(pageObject.getContent());
	}
}
