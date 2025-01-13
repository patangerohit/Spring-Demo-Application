package com.example.SpringBoot.dto;

import org.hibernate.annotations.NaturalId;

import lombok.Data;
@Data
public class student {
	long id;
    String firstName;
    String lastName;
    String email;
}
