package com.semicolon.truecaller.dto.response.accountResponse;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class AccountResponse {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
