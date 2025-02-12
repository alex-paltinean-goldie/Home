package com.home.main_service.person;

import com.home.main_service.base.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends BaseRepository<Person> {

}
