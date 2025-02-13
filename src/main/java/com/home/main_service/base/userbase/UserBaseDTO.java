package com.home.main_service.base.userbase;

import com.home.main_service.base.globalbase.BaseDTO;
import lombok.Data;

import java.util.UUID;

@Data
public class UserBaseDTO extends BaseDTO {
    protected UUID userId;
}
