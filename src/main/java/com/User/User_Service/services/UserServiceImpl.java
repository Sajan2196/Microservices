package com.User.User_Service.services;

import com.User.User_Service.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list = List.of(
            new User(123L,"Siddharth jet","1223432423"),
            new User(124L,"Ranjhna bhalse","145353453"),
            new User(125L,"Maya verma","145654674")
    );
    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
