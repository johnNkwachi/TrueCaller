package com.semicolon.truecaller.controller;

import com.semicolon.truecaller.dto.request.contactRequest.ContactRequest;
import com.semicolon.truecaller.dto.response.contactResponse.ContactResponse;
import com.semicolon.truecaller.service.contactService.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @Autowired
    ContactService contactService;

    @PostMapping("/contact")
    public ContactResponse addContact(@RequestBody ContactRequest contactRequest){
        return contactService.addContact(contactRequest);
    }
}
