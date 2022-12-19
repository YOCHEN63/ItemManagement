package com.example.itemmanagement.service;

import com.example.itemmanagement.domain.Item;

import java.util.List;

/**
 * @author Administrator
 */
public interface ItemService {

    int insertItem(Item item);

    List<Item> getItems();

    int deleteItem(Item item);

    int updateItem(Item item);
}
