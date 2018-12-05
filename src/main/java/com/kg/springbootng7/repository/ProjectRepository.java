package com.kg.springbootng7.repository;



import com.kg.springbootng7.entity.Project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    
}