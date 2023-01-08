package com.study.login.domain.dto;


import com.study.login.domain.entity.Users;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@Setter
public class UserDto {

    private String userId;
    private String userPassword;
    private String UserName;
    private String userEmail;
    private String userPhoneNumber;

    public Users dtoToEntity() {
        return Users.builder()
                .userId(userId)
                .userEmail(userEmail)
                .userPhoneNumber(userPhoneNumber)
                .build();
    }
}
