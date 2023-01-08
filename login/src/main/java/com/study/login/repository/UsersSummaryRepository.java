package com.study.login.repository;

import com.study.login.domain.entity.Users;
import com.study.login.domain.entity.UsersSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UsersSummaryRepository extends JpaRepository<Users, Long> {
    List<UsersSummary> findAll();
}
