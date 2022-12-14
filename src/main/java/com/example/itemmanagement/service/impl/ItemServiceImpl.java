package com.example.itemmanagement.service.impl;

import com.example.itemmanagement.domain.Category;
import com.example.itemmanagement.domain.Item;
import com.example.itemmanagement.mapper.CategoryMapper;
import com.example.itemmanagement.mapper.ItemMapper;
import com.example.itemmanagement.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemMapper itemMapper;

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public int insertItem(Item item) {

        Date currentTime = new Date();
        item.setGmtCreate(currentTime);
        item.setGmtModified(currentTime);
        Category category = new Category();
        category.setCategoryId(item.getCategoryId());
        if(categoryMapper.selectByCondition(category).size() != 0){
            return itemMapper.insert(item);
        } else {
            return 0;
        }
    }

    @Override
    public List<Item> getItems() {
        return itemMapper.getItems();
    }

    @Override
    public int deleteItem(Item item) {
        item.setGmtModified(new Date());
        item.setIsDeleted(1);
        return itemMapper.updateByPrimaryKeySelective(item);
    }

    @Override
    public int updateItem(Item item) {
        item.setGmtModified(new Date());
        return itemMapper.updateByPrimaryKeySelective(item);
    }
}
