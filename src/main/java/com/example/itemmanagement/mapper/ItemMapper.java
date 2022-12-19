package com.example.itemmanagement.mapper;

import com.example.itemmanagement.domain.Item;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author Administrator
* @description 针对表【item】的数据库操作Mapper
* @createDate 2022-12-16 10:23:26
* @Entity com.example.itemmanagement.domain.Item
*/

@Mapper
@Repository
public interface ItemMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Item record);

    List<Item> getItems();

    int insertSelective(Item record);

    Item selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

}
