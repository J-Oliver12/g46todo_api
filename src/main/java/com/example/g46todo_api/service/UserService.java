package com.example.g46todo_api.service;

import com.example.g46todo_api.domain.dto.UserDTOForm;
import com.example.g46todo_api.domain.dto.UserDTOView;

public interface UserService {

    UserDTOView register(UserDTOForm userDTOForm);

    UserDTOView getByEmail(String email);

    void disableByEmail(String email);

    void enableByEmail(String email);

}
