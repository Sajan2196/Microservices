package com.contact.contact_Microservice.services;

import com.contact.contact_Microservice.entities.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{


    List<Contact> list = List.of(
            new Contact(1l,"sid@gmail.com", "siddarth",123l),
            new Contact(2l,"moti@gmail.com", "ranjhna",123l),
            new Contact(3l,"maya@gmail.com", "maya",125l),
            new Contact(4l,"satyam@gmail.com", "satyam",126l),
            new Contact(5l,"vinit@gmail.com", "vinit",127l),
            new Contact(6l,"mamta@gmail.com", "mamta",128l)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
      return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }

}
