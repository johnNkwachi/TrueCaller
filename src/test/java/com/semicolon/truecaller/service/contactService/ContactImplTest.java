package com.semicolon.truecaller.service.contactService;

import com.semicolon.truecaller.dto.request.contactRequest.ContactRequest;
import com.semicolon.truecaller.dto.response.contactResponse.ContactResponse;
import com.semicolon.truecaller.model.contact.Contact;
import com.semicolon.truecaller.model.mobile.MobileNumber;
import com.semicolon.truecaller.repository.ContactRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ContactImplTest {
    @Autowired
    ContactImpl contact;
    @Autowired
    ContactService contactService;
    @Autowired
    ContactRepository contactRepository;

    private ContactResponse contactResponse;
    private ContactRequest contactRequest;

    @BeforeEach
    void setUp() {
        contactRequest = ContactRequest.builder()
                .userName("Irene")
                .email("gctgvhuh@gmail.com")
                .mobileNumber("123456")
                .countryCode("+123")
                .build();
        contactResponse = contactService.addContact(contactRequest);

    }

    @Test
    void addContact() {
        ContactResponse response = contactService.addContact(contactRequest);
        assertThat(response).isNotNull();
        assertThat(response.getUserName()).isEqualTo(contactRequest.getUserName());
    }

    @Test
    void findContactByMobileNumber() {
        ContactResponse response = contactService.addContact(contactRequest);
        assertThat(response).isNotNull();
        assertThat(response.getUserName()).isEqualTo(contactRequest.getUserName());

        Contact response2 = contactService.findContactByMobileNumber(contactRequest.getMobileNumber());
        assertThat(response2).isNotNull();

    }
}