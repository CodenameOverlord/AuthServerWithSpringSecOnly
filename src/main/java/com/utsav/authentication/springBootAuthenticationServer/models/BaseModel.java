package com.utsav.authentication.springBootAuthenticationServer.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Status status;
    private Date createdDttm;
    private Date updatedDttm;
}
