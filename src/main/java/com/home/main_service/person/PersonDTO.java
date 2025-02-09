package com.home.main_service.person;

import java.time.Instant;

public record PersonDTO(Long id, Gender gender, double height, double weight, Instant birthdate) {
    public PersonDTO(Person person) {
        this(person.getId(), person.getGender(), person.getHeight(), person.getWeight(), person.getBirthdate());
    }

    public Person.PersonBuilder toEntityBuilder() {
        return Person.builder().gender(this.gender).height(this.height).weight(this.weight).birthdate(this.birthdate);
    }
}
