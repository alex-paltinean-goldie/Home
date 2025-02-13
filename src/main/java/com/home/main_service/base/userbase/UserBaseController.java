package com.home.main_service.base.userbase;

import com.home.main_service.base.globalbase.BaseDTO;
import com.home.main_service.base.globalbase.BaseMapper;
import com.home.main_service.base.globalbase.BaseUpdateDTO;
import com.home.main_service.security.UserRequestContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UserBaseController<T extends UserBaseEntity, R extends BaseDTO, U extends BaseUpdateDTO> {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    protected UserBaseService<T> service;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    protected BaseMapper<T, R, U> mapper;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    protected UserRequestContext userRequestContext;
}
