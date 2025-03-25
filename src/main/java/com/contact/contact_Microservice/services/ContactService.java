package com.contact.contact_Microservice.services;

import com.contact.contact_Microservice.entities.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);
}
