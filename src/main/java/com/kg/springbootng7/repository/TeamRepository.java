package com.kg.springbootng7.repository;



import com.kg.springbootng7.entity.Team;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TeamRepository
 */
public interface TeamRepository extends JpaRepository<Team,Long>{

    
}