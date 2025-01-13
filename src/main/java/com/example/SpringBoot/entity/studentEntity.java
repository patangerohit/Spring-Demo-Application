package com.example.SpringBoot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

import lombok.Data;

@Data
@Entity
public class studentEntity {
    @Id
	long id;
    String firstName;
    String lastName;
    @NaturalId
    String email;
	
}
