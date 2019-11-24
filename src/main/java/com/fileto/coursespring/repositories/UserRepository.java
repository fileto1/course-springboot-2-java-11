package com.fileto.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fileto.coursespring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
