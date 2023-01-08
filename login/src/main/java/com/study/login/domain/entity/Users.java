package com.study.login.domain.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "user_primary_id")
    private Long id;

    @NotNull
    @Column(unique = true)
    private String userId;
    @NotNull
    private String userPassword;
    @NotNull
    private String userName;
    @NotNull
    private String userEmail;
    @NotNull
    private String userPhoneNumber;

    @Builder
    public Users(String userId, String userPassword, String userEmail, String userPhoneNumber, String userName) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
    }





}
