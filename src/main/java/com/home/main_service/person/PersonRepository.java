package com.home.main_service.person;

import com.home.main_service.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    Optional<Person> findByUserId(Long userId);

}
