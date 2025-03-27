package com.User.User_Service.entities;

import lombok.*;


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


}
