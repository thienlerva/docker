package com.docker.mysqldocker.repository;

import com.docker.mysqldocker.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
