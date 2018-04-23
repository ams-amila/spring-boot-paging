package com.amsamila.paging.domain.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonOutputDto {
	private final String id;
	private final String firstName;
	private final String lastName;
	private final String bio;
	private final String createdAt;
	private final String updatedAt;

	@JsonCreator
	public PersonOutputDto(@JsonProperty("id") String id, @JsonProperty("firstName") String firstName,
			@JsonProperty("lastName") String lastName, @JsonProperty("bio") String bio,
			@JsonProperty("createdAt") String createdAt, @JsonProperty("updatedAt") String updatedAt) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getBio() {
		return bio;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

}
