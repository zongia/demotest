package com.example.demo.Repos;

import com.example.demo.Entity.entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repos extends JpaRepository<entity,Long> {


}
