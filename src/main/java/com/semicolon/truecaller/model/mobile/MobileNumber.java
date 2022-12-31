package com.semicolon.truecaller.model.mobile;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document
public class MobileNumber {
    @Id
    private String id;
    private String countryCode;
    private String phoneNumber;

    public Boolean getBlocked() {
        return isBlocked;
    }

    private Boolean isBlocked;

}
