package com.example.itemmanagement.controller;

import com.example.itemmanagement.domain.LogInfo;
import com.example.itemmanagement.service.LogService;
import com.example.itemmanagement.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Administrator
 */

@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    LogService logService;

    @PostMapping("/borrow")
    public Result<Boolean> borrowItem(@RequestBody LogInfo logInfo) {
        Result<Boolean> result = new Result<>();
        int res = logService.borrowItem(logInfo);
        if(res != 0) {
            result.setResult(true);
            result.setCode(200);
            result.setMsg("success");
        } else {
            result.setCode(500);
            result.setMsg("error");
            result.setResult(false);
        }
        return result;
    }

    @PostMapping("/return")
    public Result<Boolean> returnItem(@RequestBody LogInfo logInfo) {
        Result<Boolean> result = new Result<>();
        int res = logService.returnItem(logInfo);
        if(res != 0){
            result.setCode(200);
            result.setMsg("success");
            result.setResult(true);
        } else {
            result.setCode(500);
            result.setMsg("error");
            result.setResult(false);
        }

        return result;
    }

    @GetMapping("/")
    public Result<List<LogInfo>> selectByItemId(@RequestBody LogInfo logInfo) {
        Result<List<LogInfo>> result = new Result<>();
        result.setResult(logService.selectByCondition(logInfo));
        result.setCode(200);
        result.setMsg("success");
        return result;
    }

}
