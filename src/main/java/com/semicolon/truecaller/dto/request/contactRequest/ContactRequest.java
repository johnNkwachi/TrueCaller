package com.semicolon.truecaller.dto.request.contactRequest;

import com.mongodb.lang.NonNull;
import lombok.*;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactRequest {

    private String userName;

    private String email;

    private String mobileNumber;

    private String countryCode;
}
