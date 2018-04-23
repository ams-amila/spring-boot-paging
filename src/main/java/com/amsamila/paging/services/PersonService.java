package com.amsamila.paging.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.amsamila.paging.domain.Person;

public interface PersonService {
	Person save(Person person);

	Page<Person> getAll(Pageable pageable);
}
