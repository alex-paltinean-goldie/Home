package com.home.main_service.person;

import com.home.main_service.base.userbase.UserBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends UserBaseRepository<Person> {

}
