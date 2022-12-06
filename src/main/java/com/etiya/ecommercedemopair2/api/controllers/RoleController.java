package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.RoleService;
import com.etiya.ecommercedemopair2.business.dtos.request.role.AddRoleRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.role.AddRoleResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Category;
import com.etiya.ecommercedemopair2.entities.concretes.Product;
import com.etiya.ecommercedemopair2.entities.concretes.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    private RoleService roleService;

    @Autowired
    RoleController(RoleService roleService){
        this.roleService=roleService;
    }

    @PostMapping("/add")
    public ResponseEntity<AddRoleResponse> addRole (@RequestBody AddRoleRequest addRoleRequest){
        return new ResponseEntity<AddRoleResponse>(roleService.addRole(addRoleRequest), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public List<Role> getAll(){
        return roleService.getAll();
    }

    @GetMapping("/getById")
    public Role getByIdPath(@RequestParam("id") int id){
        return roleService.getById(id);
    }
}
