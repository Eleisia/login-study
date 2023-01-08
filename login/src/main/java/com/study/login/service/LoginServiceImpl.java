package com.study.login.service;

import com.study.login.domain.dto.UserDto;
import com.study.login.domain.dto.UserSummaryDto;
import com.study.login.domain.entity.Users;
import com.study.login.domain.entity.UsersSummary;
import com.study.login.repository.LoginRepository;
import com.study.login.repository.UsersSummaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityExistsException;
import javax.validation.ConstraintViolationException;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class LoginServiceImpl implements LoginService{
    private final PasswordEncoder passwordEncoder;
    private final LoginRepository loginRepository;
    private final UsersSummaryRepository usersSummaryRepository;

    public Users registUser(UserDto userDto) {
        Users users = userDto.dtoToEntity();
        users.setUserPassword(passwordEncoder.encode(userDto.getUserPassword()));
        loginRepository.save(users);

        return users;
    }

    public List<UsersSummary> findAllUser() {
        return usersSummaryRepository.findAllProjectedBy();
    }

    public  List<UserSummaryDto> findAllDto() {
        return loginRepository.findAllDto();
    }



}
