package com.amsamila.paging.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.amsamila.paging.domain.Person;
import com.amsamila.paging.domain.dto.PersonInputDto;
import com.amsamila.paging.domain.dto.PersonOutputDto;
import com.amsamila.paging.services.PersonService;
import com.amsamila.paging.transformers.PersonPageToPersonOutputDtoPageTransformer;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	private final PersonService personService;

	@Autowired
	public PersonController(final PersonService personService) {
		super();
		this.personService = personService;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	public @ResponseBody PersonOutputDto savePerson(@RequestBody PersonInputDto personInput) {
		Person savedPerson = this.personService.save(new Person.Builder().firstName(personInput.getFirstName())
				.lastName(personInput.getLastName()).bio(personInput.getBio()).builg());
		return new PersonOutputDto(savedPerson.getId(), savedPerson.getFirstName(), savedPerson.getLastName(),
				savedPerson.getBio(), savedPerson.getCreatedAt().toString(), savedPerson.getUpdatedAt().toString());
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseStatus(code = HttpStatus.OK)
	public @ResponseBody Page<PersonOutputDto> getPersons(Pageable pageable) {
		return new PersonPageToPersonOutputDtoPageTransformer().transform(this.personService.getAll(pageable));
	}

}
