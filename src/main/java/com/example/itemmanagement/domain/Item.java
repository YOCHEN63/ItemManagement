package com.example.itemmanagement.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName item
 */
@Data
public class Item implements Serializable {
    /**
     * 
     */
    private Integer itemId;

    /**
     * 
     */
    private Date gmtCreate;

    /**
     * 
     */
    private Date gmtModified;

    /**
     * 
     */
    private String itemName;

    /**
     * 
     */
    private Integer categoryId;

    /**
     * 
     */
    private Integer isDeleted;

    /**
     * 
     */
    private Integer isReturned;

    private static final long serialVersionUID = 1L;
}