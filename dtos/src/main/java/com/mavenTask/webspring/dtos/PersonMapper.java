package com.mavenTask.webspring.dtos;

import com.mavenTask.webspring.models.Person;

public class PersonMapper {
	
	public static PersonDto toDto(Person person) {
		return new PersonDto(person.getName());
	}
	
	public static Person toBO(PersonDto personDto) {
		return new Person(personDto.getName());
	}

}
