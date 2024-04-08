package com.rest.mudah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.mudah.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    
}