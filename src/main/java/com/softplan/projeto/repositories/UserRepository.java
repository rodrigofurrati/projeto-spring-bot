package com.softplan.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softplan.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
