package com.email.email.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.email.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{
    
}
