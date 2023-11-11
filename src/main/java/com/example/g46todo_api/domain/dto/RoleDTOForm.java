package com.example.g46todo_api.domain.dto;

import lombok.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RoleDTOForm {
    // todo : add validation annotations if needed

    private Long id;
    private String name;
}
