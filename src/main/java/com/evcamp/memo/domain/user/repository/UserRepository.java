package com.evcamp.memo.domain.user.repository;


import com.evcamp.memo.domain.user.entity.User;
import org.hibernate.dialect.lock.OptimisticEntityLockException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Long findIdByUserNameAndPassword(String userName, String password);
    Optional<User> findById(Long id);

}