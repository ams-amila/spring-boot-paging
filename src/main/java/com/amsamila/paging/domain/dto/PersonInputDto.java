package com.amsamila.paging.domain.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonInputDto {
	private final String firstName;
	private final String lastName;
	private final String bio;

	@JsonCreator
	public PersonInputDto(@JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName,
			@JsonProperty("bio") String bio) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getBio() {
		return this.bio;
	}

}
