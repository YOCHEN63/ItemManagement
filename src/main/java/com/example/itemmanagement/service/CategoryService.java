package com.example.itemmanagement.service;

import com.example.itemmanagement.domain.Category;

import java.util.List;

public interface CategoryService {

    int insertCategory(String category);

    List<Category> getCategory();
}
