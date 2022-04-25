package com.spring.springsecurity.repository;

import com.spring.springsecurity.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository <Role, Long> {
    Role findByRole(String role);
}
