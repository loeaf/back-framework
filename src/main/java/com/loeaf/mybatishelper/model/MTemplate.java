package com.loeaf.mybatishelper.model;

import java.util.Date;
import lombok.Data;

@Data
public class MTemplate {
    private String id;

    private Date registDatetime;

    private Date modifiedDatetime;
}