package com.study.login.service;

import com.study.login.domain.dto.UserDto;
import com.study.login.domain.dto.UserSummaryDto;
import com.study.login.domain.entity.Users;
import com.study.login.domain.entity.UsersSummary;

import java.util.List;

public interface LoginService {
    public Users registUser(UserDto userDto);
    public List<UsersSummary> findAllUser();
    public List<UserSummaryDto> findAllDto();

}
