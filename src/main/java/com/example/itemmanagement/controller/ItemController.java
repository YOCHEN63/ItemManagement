package com.example.itemmanagement.controller;

import com.example.itemmanagement.domain.Item;
import com.example.itemmanagement.service.ItemService;
import com.example.itemmanagement.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * @author Yixuan Chen
 */
@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/")
    public Result<List<Item>> queryItems() {
        Result<List<Item>> result = new Result<>();
        List<Item> itemList = itemService.getItems();
        result.setResult(itemList);
        result.setCode(200);
        result.setMsg("Success");
        return result;
    }

    @PostMapping("/")
    public Result<Boolean> insertItem(@RequestBody Item item) {
        Result<Boolean> result = new Result<>();
        int res = itemService.insertItem(item);
        if(res != 0) {
            result.setCode(200);
            result.setMsg("success");
            result.setResult(true);
        } else {
            result.setCode(500);
            result.setMsg("fail");
            result.setResult(false);
        }
        return result;
    }

    @DeleteMapping("/")
    public Result<Boolean> deleteItem(@RequestBody Item item) {
        Result<Boolean> result = new Result<>();
        int res = itemService.deleteItem(item);
        if(res != 0) {
            result.setResult(true);
            result.setMsg("success");
            result.setCode(200);
        } else {
            result.setMsg("false");
            result.setCode(500);
            result.setResult(false);
        }
        return result;
    }

    @PatchMapping("/")
    public Result<Boolean> updateItem(@RequestBody Item item) {
        Result<Boolean> result = new Result<Boolean>();
        int res = itemService.updateItem(item);
        if(res != 0) {
            result.setResult(true);
            result.setMsg("success");
            result.setCode(200);
        }else {
            result.setMsg("false");
            result.setCode(500);
            result.setResult(false);
        }
        return result;
    }
}
