package com.example.itemmanagement.controller;

import com.example.itemmanagement.domain.Category;
import com.example.itemmanagement.service.CategoryService;
import com.example.itemmanagement.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public Result<List<Category>> getCategory() {
        Result<List<Category>> result = new Result<>();
        result.setResult(categoryService.getCategory());
        if (result.getResult().size() > 0) {
            result.setMsg("success");
            result.setCode(200);
        }
        return result;
    }

    @PostMapping("/")
    public Result<Boolean> addCategory(@RequestBody Category category) {
        Result<Boolean> result = new Result<>();
        result.setResult(categoryService.insertCategory(category.getCategoryName()) != 0);
        if(result.getResult()) {
            result.setMsg("category add successfully");
            result.setCode(200);
        } else {
            result.setCode(500);
            result.setMsg("category add failed");
        }
        return result;
    }

}
