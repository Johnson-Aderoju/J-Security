package com.Johnson.Jsecurity.Repository;

import com.Johnson.Jsecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername (String username);
}
