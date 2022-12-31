package com.semicolon.truecaller.service.contactService;

import com.semicolon.truecaller.dto.request.contactRequest.ContactRequest;
import com.semicolon.truecaller.dto.response.contactResponse.ContactResponse;
import com.semicolon.truecaller.model.contact.Contact;

import java.util.List;

public interface ContactService {
    ContactResponse addContact(ContactRequest contactRequest);
    Boolean unBlockContactByContactName(String contactName);
    Boolean blockContactByContactName(String contactName);
    List<Contact> findAllBlockedContacts();
    ContactResponse editContact(String contactName);
    Contact findContactByMobileNumber(String mobileNumber);
    Contact findContactById(String id);
    ContactResponse findByContactName(String contactName);
    List<ContactResponse> findAllContact();
    String deleteContactByContactName(String contactName);
    String deleteContactById(String id);
    String deleteAllContact();
}
