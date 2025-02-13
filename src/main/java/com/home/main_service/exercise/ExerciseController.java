package com.home.main_service.exercise;

import com.home.main_service.base.globalbase.BaseUpdateDTO;
import com.home.main_service.base.globalbase.GlobalCollectionBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/exercises")
public class ExerciseController extends GlobalCollectionBaseController<Exercise, ExerciseDTO, BaseUpdateDTO> {

}

