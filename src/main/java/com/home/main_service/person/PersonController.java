package com.home.main_service.person;

import com.home.main_service.security.UserRequestContext;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("users/{userId}/person")
public class PersonController {

    private final PersonRepository personRepository;
    private final UserRequestContext userRequestContext;

    @GetMapping()
    public PersonDTO get(@PathVariable long userId) {
        Person person = personRepository.findByUserId(userId).orElseThrow(RuntimeException::new);
        if (person.getUserId().equals(userRequestContext.getId())) {
            return new PersonDTO(person);
        } else {
            throw new RuntimeException();
        }
    }

    @PutMapping()
    public PersonDTO update(@PathVariable long id, @RequestBody PersonDTO newPerson) {
        Person person = personRepository.findByUserId(id).orElse(Person.builder().userId(userRequestContext.getId()).build());
        if (person.getUserId().equals(userRequestContext.getId())) {
            Person savedPerson = personRepository.save(newPerson.toEntityBuilder().id(person.getId()).build());
            return new PersonDTO(savedPerson);
        } else {
            throw new RuntimeException();
        }

    }

}

