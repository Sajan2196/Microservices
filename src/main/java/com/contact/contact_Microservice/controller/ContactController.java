package com.contact.contact_Microservice.controller;


import com.contact.contact_Microservice.entities.Contact;
import com.contact.contact_Microservice.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {


    //commmit
    @Autowired
    public ContactService contactService;

    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId){

        return this.contactService.getContactsOfUser(userId);
    }

}
