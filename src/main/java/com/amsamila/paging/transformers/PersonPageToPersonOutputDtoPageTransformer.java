package com.amsamila.paging.transformers;

import org.springframework.data.domain.Page;

import com.amsamila.paging.domain.Person;
import com.amsamila.paging.domain.dto.PersonOutputDto;

public class PersonPageToPersonOutputDtoPageTransformer implements Transformer<Page<Person>, Page<PersonOutputDto>> {

	@Override
	public Page<PersonOutputDto> transform(Page<Person> source) {
		return source.map(person -> new PersonToPersonDtoTransformer().transform(person));
	}

}
