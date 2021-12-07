package com.luv2code.springboot.thymeleafdemo.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class EmployeeDto{
    private int id;


    private String firstName;

    private String lastName;


    private String email;



}
