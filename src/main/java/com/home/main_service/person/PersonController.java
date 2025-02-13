package com.home.main_service.person;

import com.home.main_service.base.BaseMapper;
import com.home.main_service.base.BaseService;
import com.home.main_service.base.SingletonBaseController;
import com.home.main_service.security.UserRequestContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("/person")
public class PersonController extends SingletonBaseController<Person, PersonDTO, UpdatePersonDTO> {

}

