package com.pedrobruno.course.repositories;

import com.pedrobruno.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
