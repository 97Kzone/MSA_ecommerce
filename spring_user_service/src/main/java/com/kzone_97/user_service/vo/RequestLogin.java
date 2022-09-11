package com.kzone_97.user_service.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {
    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less than 2 characters")
    @Email
    private String email;

    @NotNull(message = "Pasword cannot be null")
    @Size(min = 8, message = "Password must be equals or grater than 8 cahracters")
    private String password;
}