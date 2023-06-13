package com.loeaf.mybatishelper.dto.param;

import lombok.Data;

import java.util.List;

@Data
public class M_RestaurantParam {
    private String name;
    private List<String> week;
    private List<String> times;
    private String startDt;
    private String endDt;
    private List<String> dateList;
}
