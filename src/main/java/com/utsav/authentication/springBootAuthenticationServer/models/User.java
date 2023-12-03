package com.utsav.authentication.springBootAuthenticationServer.models;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "users")
@Getter
@Setter
public class User extends BaseModel{
    private String email;
    private String password;
    private String fullName;
    private String dob;
    @Enumerated(EnumType.ORDINAL)
    private UserStatus userStatus = UserStatus.ACTIVE;
    @OneToMany(mappedBy = "user")
    private List<Session> sessions;
    @OneToMany(mappedBy = "role")
    private List<Role> roles;

}
