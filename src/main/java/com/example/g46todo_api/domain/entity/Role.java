package com.example.g46todo_api.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;

    public Role(String name) {
        this.name = name;
    }
}
