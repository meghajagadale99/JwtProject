package com.bridgelabz.jwtproject.Repository;

import com.bridgelabz.jwtproject.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
