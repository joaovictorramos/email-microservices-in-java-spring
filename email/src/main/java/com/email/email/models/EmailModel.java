package com.email.email.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.email.email.enums.StatusEmail;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EmailModel")
public class EmailModel implements Serializable{
    private static final long serialVersionUID = 0;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emailId;

    private String ownerRef;

    private String emailFrom;

    private String emailTo;

    private String subject;
    
    @Column(columnDefinition = "TEXT")
    private String text;

    private LocalDateTime sendDateTime;

    private StatusEmail statusEmail;
}
