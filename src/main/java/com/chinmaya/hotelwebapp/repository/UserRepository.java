package com.chinmaya.hotelwebapp.repository;

import com.chinmaya.hotelwebapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
