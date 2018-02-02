package com.core.user.reposiyory;

import com.core.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findBySex(String sex);

    User findById(Integer id);
}
