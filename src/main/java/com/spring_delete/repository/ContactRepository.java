package com.spring_delete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_delete.entities.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
