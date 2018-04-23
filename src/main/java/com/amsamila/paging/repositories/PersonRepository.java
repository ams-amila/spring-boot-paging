package com.amsamila.paging.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.amsamila.paging.domain.Person;

public interface PersonRepository extends PagingAndSortingRepository<Person, String> {

}
