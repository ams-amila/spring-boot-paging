package com.amsamila.paging.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.amsamila.paging.domain.Person;
import com.amsamila.paging.repositories.PersonRepository;
import com.amsamila.paging.services.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	private final PersonRepository personRepository;

	@Autowired
	public PersonServiceImpl(final PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}

	@Override
	public Person save(Person person) {
		return this.personRepository.save(person);
	}

	@Override
	public Page<Person> getAll(Pageable pageable) {
		return this.personRepository.findAll(pageable);
	}

}
