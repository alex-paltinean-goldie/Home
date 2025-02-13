package com.home.main_service.person;

import com.home.main_service.base.userbase.SingletonUserBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/person")
public class PersonController extends SingletonUserBaseController<Person, PersonDTO, UpdatePersonDTO> {

}

