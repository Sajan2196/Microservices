package com.contact.contact_Microservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class Contact {

    private Long cId;
    private String email;
    private String contactName;

    private Long UserId;

    public Contact(Long cId, String email, String contactName, Long userId) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.UserId = userId;
    }



    public Long getcId() {
        return cId;
    }

    public String getEmail() {
        return email;
    }

    public String getContactName() {
        return contactName;
    }

    public Long getUserId() {
        return UserId;
    }
}
