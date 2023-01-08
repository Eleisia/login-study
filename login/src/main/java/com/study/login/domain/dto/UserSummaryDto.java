package com.study.login.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSummaryDto {

    private String userId;
    private String userName;
    private String userEmail;
    private String userPhoneNumber;

    public UserSummaryDto(String userId, String userEmail, String userName, String userPhoneNumber) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
    }


}
