package com.study.login.controller;

import com.study.login.domain.dto.UserDto;
import com.study.login.domain.dto.UserSummaryDto;
import com.study.login.domain.entity.Users;
import com.study.login.domain.entity.UsersSummary;
import com.study.login.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @GetMapping(value = "/pro")
    public List<UsersSummary> findAllUser() {
        return loginService.findAllUser();
    }

    @GetMapping(value = "/dto")
    public List<UserSummaryDto> findAllDto() {
        return loginService.findAllDto();
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> save(@RequestBody UserDto userDto) {
        Users users = loginService.registUser(userDto);
        return new ResponseEntity<>(users, HttpStatus.ACCEPTED);
    }


}
