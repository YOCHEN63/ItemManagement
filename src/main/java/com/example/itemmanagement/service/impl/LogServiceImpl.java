package com.example.itemmanagement.service.impl;

import com.example.itemmanagement.domain.Item;
import com.example.itemmanagement.domain.LogInfo;
import com.example.itemmanagement.mapper.ItemMapper;
import com.example.itemmanagement.mapper.LogInfoMapper;
import com.example.itemmanagement.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogInfoMapper logInfoMapper;

    @Autowired
    ItemMapper itemMapper;

    @Override
    public int borrowItem(LogInfo logInfo) {
        Date currentTime = new Date();
        logInfo.setBorrowTime(currentTime);
        Item item = new Item();
        item.setItemId(logInfo.getItemId());
        item.setGmtModified(currentTime);
        item.setIsReturned(0);
        if(itemMapper.updateByPrimaryKeySelective(item)!=0) {
            return logInfoMapper.insert(logInfo);
        } else {
            return 0;
        }
    }

    @Override
    public int returnItem(LogInfo logInfo) {
        Date currentTime = new Date();
        Item item = new Item();
        item.setItemId(logInfo.getItemId());
        item.setGmtModified(currentTime);
        item.setIsReturned(1);
        logInfo.setIsReturned(0);
        int logId = logInfoMapper.selectByCondition(logInfo).get(0).getLogId();
        LogInfo tempLog = new LogInfo();
        tempLog.setLogId(logId);
        tempLog.setIsReturned(1);
        tempLog.setReturnTime(currentTime);
        return logInfoMapper.updateByPrimaryKeySelective(tempLog);
    }

    @Override
    public List<LogInfo> selectByCondition(LogInfo logInfo) {
        return logInfoMapper.selectByCondition(logInfo);
    }


}
