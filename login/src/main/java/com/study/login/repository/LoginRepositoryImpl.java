package com.study.login.repository;

import com.study.login.domain.dto.UserSummaryDto;
import com.study.login.domain.entity.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class LoginRepositoryImpl implements LoginRepository{

    private final EntityManager em;

    public Users save(Users users) {
        em.persist(users);
        return users;
    }

    public Users findOne(Users users) {
        return em.find(Users.class, users.getId());
    }

    public List<UserSummaryDto> findAllDto() {
        return em.createQuery("select new com.study.login.domain.dto.UserSummaryDto(u.userId, u.userEmail, u.userName, u.userPhoneNumber) from Users u", UserSummaryDto.class).getResultList();
    }
}
