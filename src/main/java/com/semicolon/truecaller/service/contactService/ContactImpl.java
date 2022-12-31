package com.semicolon.truecaller.service.contactService;

import com.semicolon.truecaller.dto.request.contactRequest.ContactRequest;
import com.semicolon.truecaller.dto.response.contactResponse.ContactResponse;
import com.semicolon.truecaller.exceptions.AccountException;
import com.semicolon.truecaller.exceptions.ContactException;
import com.semicolon.truecaller.model.contact.Contact;
import com.semicolon.truecaller.model.user.Account;
import com.semicolon.truecaller.repository.ContactRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactImpl implements ContactService{
    @Autowired
    ContactRepository contactRepository;
    @Override
    public ContactResponse addContact(ContactRequest contactRequest) {
        Optional<Contact> findContact =
                Optional.ofNullable(contactRepository.findContactByUserName(contactRequest.getUserName()));
        if (findContact.isPresent()) throw new ContactException("This " + findContact + " already exist");
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactRequest, contact);
        Contact savedContact = contactRepository.save(contact);
        ContactResponse contactResponse = new ContactResponse();
        BeanUtils.copyProperties(savedContact, contactResponse);
        return contactResponse;
    }

    @Override
    public Boolean unBlockContactByContactName(String contactName) {
        return null;
    }

    @Override
    public Boolean blockContactByContactName(String contactName) {
        return null;
    }

    @Override
    public List<Contact> findAllBlockedContacts() {
        return null;
    }

    @Override
    public ContactResponse editContact(String contactName) {
        return null;
    }

    @Override
    public Contact findContactByMobileNumber(String mobileNumber) {
        Contact contact = contactRepository.findContactByMobileNumber(mobileNumber);
        if (contact == null)throw new ContactException("This " + mobileNumber + " does not exist");
        return contact;
    }

    @Override
    public Contact findContactById(String id) {
        Contact contact = contactRepository.findContactById(id);
        if (contact == null) throw new AccountException("Contact with this " + id + " does not exist");
        return contact;
    }

    @Override
    public ContactResponse findByContactName(String contactName) {
        return null;
    }

    @Override
    public List<ContactResponse> findAllContact() {
        return null;
    }

    @Override
    public String deleteContactByContactName(String contactName) {
        return null;
    }

    @Override
    public String deleteContactById(String id) {
        return null;
    }

    @Override
    public String deleteAllContact() {
        return null;
    }
}
