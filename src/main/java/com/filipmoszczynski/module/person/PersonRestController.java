package com.filipmoszczynski.module.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonRestController {

	@Autowired
	private PersonService personService;

	@GetMapping(value = "/api/person")
	public List<PersonDto> getPersons() {
		List<PersonEntity> persons = personService.getAll();
		return PersonMapper.asList(persons);
	}

	@GetMapping(value = "/api/person/1")
	public PersonDto getPerson() {
		PersonEntity person = personService.getOne();
		return PersonMapper.map(person);
	}

}
