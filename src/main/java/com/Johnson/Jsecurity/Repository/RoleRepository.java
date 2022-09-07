package com.Johnson.Jsecurity.Repository;

import com.Johnson.Jsecurity.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName (String name);
 }
