package com.example.itemmanagement.mapper;

import com.example.itemmanagement.domain.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author Administrator
* @description 针对表【category】的数据库操作Mapper
* @createDate 2022-12-16 10:23:26
* @Entity com.example.itemmanagement.domain.Category
*/

@Mapper
@Repository
public interface CategoryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    List<Category> getCategory();

    List<Category> selectByCondition(Category condition);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

}
