package com.spring_delete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_delete.entities.Lead;
@Repository
public interface LeadRepository extends JpaRepository<Lead, Integer> {

}
