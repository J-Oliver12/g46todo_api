package com.example.g46todo_api.service;

import com.example.g46todo_api.domain.dto.PersonDTOForm;
import com.example.g46todo_api.domain.dto.PersonDTOView;
import com.example.g46todo_api.domain.entity.Person;
import com.example.g46todo_api.exception.DataNotFoundException;
import com.example.g46todo_api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public PersonDTOView create(PersonDTOForm personDtoForm) {
        if (personDtoForm == null) throw new IllegalArgumentException("PersonDto was null.");

        Person person = new Person(personDtoForm.getName());
        Person savedPerson = personRepository.save(person);
        return PersonDTOView.builder().id(savedPerson.getId()).name(savedPerson.getName()).build();

    }

    @Override
    public PersonDTOView findById(Long id) {
        Person person = personRepository.findById(id).orElseThrow(() -> new DataNotFoundException("Person id is not valid."));
        return PersonDTOView.builder().id(person.getId()).name(person.getName()).build();

    }

    @Override
    public List<PersonDTOView> findAll() {
        List<Person> persons = personRepository.findAll();
        return persons.stream()
                .map(person -> PersonDTOView.builder().id(person.getId()).name(person.getName()).build())
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public PersonDTOView update(PersonDTOForm personDtoForm) {
        Person person = personRepository.findById(personDtoForm.getId()).orElseThrow(() -> new DataNotFoundException("Person Id is not valid."));
        return PersonDTOView.builder().id(person.getId()).name(person.getName()).build();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Person person = personRepository.findById(id).orElseThrow(() -> new DataNotFoundException("Person id is not valid."));
        personRepository.delete(person);
    }


}