package com.projetospring.demo.repository;
import java.util.List;

import com.projetospring.demo.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
    
    @Query("SELECT u from User u WHERE u.id > :id")
    public List<User> findAllMoreThan(@Param("id") long id);

    public List<User> findByIdGreaterThan(@Param("id") long id);

}
