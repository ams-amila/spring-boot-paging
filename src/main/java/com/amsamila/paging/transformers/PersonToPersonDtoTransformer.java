package com.amsamila.paging.transformers;

import com.amsamila.paging.domain.Person;
import com.amsamila.paging.domain.dto.PersonOutputDto;

public class PersonToPersonDtoTransformer implements Transformer<Person, PersonOutputDto> {

	@Override
	public PersonOutputDto transform(Person source) {
		return new PersonOutputDto(source.getId(), source.getFirstName(), source.getLastName(), source.getBio(),
				source.getCreatedAt().toString(), source.getUpdatedAt().toString());
	}

}
