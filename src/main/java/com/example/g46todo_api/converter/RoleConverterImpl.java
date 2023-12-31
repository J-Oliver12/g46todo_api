package com.example.g46todo_api.converter;

import com.example.g46todo_api.domain.dto.RoleDTOForm;
import com.example.g46todo_api.domain.dto.RoleDTOView;
import com.example.g46todo_api.domain.entity.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleConverterImpl implements RoleConverter {

    @Override
    public RoleDTOView toRoleDTOView(Role entity) {
        return RoleDTOView.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
        //return new RoleDTOView(entity.getId(), entity.getName());
    }

    @Override
    public Role toRoleEntity(RoleDTOView dtoView) {
        return Role.builder().id(dtoView.getId()).name(dtoView.getName()).build();
        //return new Role(dtoView.getId(), dtoView.getName());
    }
}
