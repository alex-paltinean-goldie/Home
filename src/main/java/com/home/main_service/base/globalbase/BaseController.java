package com.home.main_service.base.globalbase;

import com.home.main_service.security.UserRequestContext;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController <T extends BaseEntity, R extends BaseDTO, U extends BaseUpdateDTO> {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    protected BaseService<T> service;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    protected BaseMapper<T, R, U> mapper;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    protected UserRequestContext userRequestContext;
}
