package com.semicolon.truecaller.dto.userdto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDto {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
