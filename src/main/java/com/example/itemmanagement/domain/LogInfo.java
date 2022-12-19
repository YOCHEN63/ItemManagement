package com.example.itemmanagement.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName log_info
 */
@Data
public class LogInfo implements Serializable {
    /**
     * 
     */
    private Integer logId;

    /**
     * 
     */
    private Integer itemId;

    /**
     * 
     */
    private Date borrowTime;

    /**
     * 
     */
    private Date returnTime;

    /**
     * 
     */
    private Integer isReturned;

    /**
     * 
     */
    private String user;

    /**
     * 
     */
    private String reason;

    private static final long serialVersionUID = 1L;
}