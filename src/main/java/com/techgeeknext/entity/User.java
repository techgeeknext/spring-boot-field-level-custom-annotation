package com.techgeeknext.entity;

import com.techgeeknext.validator.ValidEmail;
import com.techgeeknext.validator.PasswordConfirmation;
import com.techgeeknext.validator.PhoneNumber;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@PasswordConfirmation(
        password = "password",
        confirmPassword = "confirmPassword",
        message = "Password and confirmation password must be the same!"
)

public class User {
    private String firstName;
    private String lastName;
    @PhoneNumber(message = "This phone number is not valid")
    private String phoneNumber;
    private String password;
    private String confirmPassword;
    @NotBlank
    @ValidEmail
    private String email;
}