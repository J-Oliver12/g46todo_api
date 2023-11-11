package com.example.g46todo_api.converter;

import com.example.g46todo_api.domain.dto.RoleDTOForm;
import com.example.g46todo_api.domain.dto.RoleDTOView;
import com.example.g46todo_api.domain.entity.Role;

public interface RoleConverter {

    RoleDTOView toRoleDTOView(Role entity);

    Role toRoleEntity(RoleDTOView dtoView);
}
