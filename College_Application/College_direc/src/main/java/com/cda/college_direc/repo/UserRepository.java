package com.cda.college_direc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cda.college_direc.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsernameAndRole(String username, String role);
}