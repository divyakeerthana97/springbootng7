package com.kg.springbootng7.repository;



import com.kg.springbootng7.entity.Branch;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {

    
}