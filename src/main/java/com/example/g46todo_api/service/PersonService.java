package com.example.g46todo_api.service;

import com.example.g46todo_api.domain.dto.PersonDTOForm;
import com.example.g46todo_api.domain.dto.PersonDTOView;

import java.util.List;

public interface PersonService {
    PersonDTOView create(PersonDTOForm personDtoForm);
    PersonDTOView findById(Long id);
    List<PersonDTOView> findAll();
    PersonDTOView update(PersonDTOForm personDtoForm);
    void delete(Long id);
}
