package com.example.g46todo_api.startup;

import com.example.g46todo_api.domain.entity.Role;
import com.example.g46todo_api.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RoleDataLoader implements CommandLineRunner {


    @Autowired
    private RoleRepository roleRepository;


    @Override
    public void run(String... args) throws Exception {
        // execute this logic...
        // How to call save method of RoleRepository Interface?
        roleRepository.save(new Role("ADMIN"));
        roleRepository.save(new Role("USER"));
        roleRepository.save(new Role("GUEST"));
        // add more roles as needed
    }


}
