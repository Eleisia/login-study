package com.study.login.domain.entity;

import javax.persistence.Entity;

public interface UsersSummary {
    String getUserId();
    String getUserEmail();
    String getUserName();
    String getUserPhoneNumber();

}
