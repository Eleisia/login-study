package com.study.login.repository;

import com.study.login.domain.dto.UserSummaryDto;
import com.study.login.domain.entity.Users;

import java.util.List;

public interface LoginRepository {
    public Users save(Users users);
    public Users findOne(Users users);
    public List<UserSummaryDto> findAllDto();
}
