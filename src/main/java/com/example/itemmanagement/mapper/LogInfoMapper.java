package com.example.itemmanagement.mapper;

import com.example.itemmanagement.domain.Item;
import com.example.itemmanagement.domain.LogInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author Administrator
* @description 针对表【log_info】的数据库操作Mapper
* @createDate 2022-12-16 10:23:26
* @Entity com.example.itemmanagement.domain.LogInfo
*/

@Mapper
@Repository
public interface LogInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(LogInfo record);

    List<LogInfo> selectByCondition(LogInfo logInfo);

    int insertSelective(LogInfo record);

    LogInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LogInfo record);

    int updateByPrimaryKey(LogInfo record);

}
