package com.amsamila.paging.domain;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "person_c")
public class Person {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String bio;

	@CreatedDate
	private DateTime createdAt;

	@LastModifiedDate
	private DateTime updatedAt;

	public Person() {
		super();
	}

	public Person(Builder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.bio = builder.bio;
		this.createdAt = builder.createdAt;
		this.updatedAt = builder.updatedAt;
	}

	public String getId() {
		return this.id;
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

	public DateTime getCreatedAt() {
		return this.createdAt;
	}

	public DateTime getUpdatedAt() {
		return this.updatedAt;
	}

	public static class Builder {
		private String id;
		private String firstName;
		private String lastName;
		private String bio;
		private DateTime createdAt;
		private DateTime updatedAt;

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder bio(String bio) {
			this.bio = bio;
			return this;
		}

		public Builder createdAt(DateTime createdAt) {
			this.createdAt = createdAt;
			return this;
		}

		public Builder updatedAt(DateTime updatedAt) {
			this.updatedAt = updatedAt;
			return this;
		}

		public Person builg() {
			return new Person(this);
		}
	}

}
