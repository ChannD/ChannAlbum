package com.chann.album.repository;

import com.chann.album.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
