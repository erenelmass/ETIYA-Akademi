package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.entities.concretes.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Category getById(int id);
}
