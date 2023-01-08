package com.study.login.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSummaryDto {

    private String userId;
    private String UserName;
    private String userEmail;
    private String userPhoneNumber;
}
