package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.request.role.AddRoleRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.role.AddRoleResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Role;

import java.util.List;

public interface RoleService {
    AddRoleResponse addRole (AddRoleRequest addRoleRequest);

    List<Role> getAll();

    Role getById(int id);
}
