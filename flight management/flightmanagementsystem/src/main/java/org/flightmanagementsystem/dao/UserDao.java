package org.flightmanagementsystem.dao;

import org.flightmanagementsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long>{
}
