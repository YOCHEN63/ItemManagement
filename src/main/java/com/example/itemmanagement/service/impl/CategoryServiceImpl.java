package com.example.itemmanagement.service.impl;

import com.example.itemmanagement.domain.Category;
import com.example.itemmanagement.mapper.CategoryMapper;
import com.example.itemmanagement.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public int insertCategory(String category) {
        Category categoryDO = new Category();
        categoryDO.setCategoryName(category);
        categoryDO.setGmtCreate(new Date());
        categoryDO.setGmtModified(new Date());
        return categoryMapper.insert(categoryDO);
    }

    @Override
    public List<Category> getCategory() {
        return categoryMapper.getCategory();
    }
}
