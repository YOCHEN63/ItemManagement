package com.example.itemmanagement.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @author Yixuan Chen
 * @TableName category
 */
@Data
public class Category implements Serializable {
    /**
     * 
     */
    private Integer categoryId;

    /**
     * 
     */
    private String categoryName;

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
    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}