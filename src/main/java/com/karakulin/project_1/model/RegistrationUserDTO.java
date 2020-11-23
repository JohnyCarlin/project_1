package com.karakulin.project_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationUserDTO {

    private String email;

    private String password;

    private String confirmPassword;

    private String firstName;

    private String lastName;

    private long regDate;

    private long lastSeenDate;

    private String provider;

    private boolean autoReg;

    private String phone;
}
