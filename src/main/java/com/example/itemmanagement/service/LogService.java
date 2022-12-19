package com.example.itemmanagement.service;

import com.example.itemmanagement.domain.LogInfo;

import java.util.List;

public interface LogService {

    int borrowItem(LogInfo logInfo);

    int returnItem(LogInfo logInfo);

    List<LogInfo> selectByCondition(LogInfo logInfo);
}
