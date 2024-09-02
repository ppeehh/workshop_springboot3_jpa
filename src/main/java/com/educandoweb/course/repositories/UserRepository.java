package com.educandoweb.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<Order, Long> {

	void saveAll(List<User> asList);

}
