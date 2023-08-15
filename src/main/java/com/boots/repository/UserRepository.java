package com.boots.repository;

import com.boots.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    @Override
    List<User> findAll();

    List<User> findByUsername(String username);

    Optional<User> findById(Long id);

    List<User> findAllBy();
}
