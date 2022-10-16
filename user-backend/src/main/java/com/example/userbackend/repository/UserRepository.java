package com.example.userbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userbackend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
