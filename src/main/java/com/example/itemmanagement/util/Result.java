package com.example.itemmanagement.util;

import lombok.Data;

/**
 * @author Administrator
 */

@Data
public class Result<T> {

    private int code;

    private T result;

    private String msg;

}
