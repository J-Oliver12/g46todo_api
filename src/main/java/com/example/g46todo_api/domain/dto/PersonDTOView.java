package com.example.g46todo_api.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PersonDTOView {

    private Long id;
    private String name;

}
