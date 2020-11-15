package com.filipmoszczynski.module.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

	public PersonEntity getOne() {
		return new PersonEntity()
				.setName("Michał")
				.setSurname("Szałkowski")
				.setEmail("admin@michalszalkowski.com");
	}

	public List<PersonEntity> getAll() {
		PersonEntity person1 = new PersonEntity()
				.setName("Michał")
				.setSurname("Szałkowski")
				.setEmail("admin@michalszalkowski.com");
		PersonEntity person2 = new PersonEntity()
				.setName("Marta")
				.setSurname("Szałkowskia")
				.setEmail("admin@michalszalkowski.com");
		return List.of(person1, person2);
	}
}
