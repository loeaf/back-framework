package com.loeaf.mybatishelper.mapper;

import com.loeaf.mybatishelper.model.MTemplate;


public interface MTemplateMapper {
    int deleteByPrimaryKey(String id);

    int insert(MTemplate record);

    int insertSelective(MTemplate record);

    MTemplate selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MTemplate record);

    int updateByPrimaryKey(MTemplate record);
}