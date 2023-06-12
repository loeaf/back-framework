package com.loeaf.mybatishelper.service;

import com.loeaf.mybatishelper.model.MTemplate;
public interface MTemplateService{


    int deleteByPrimaryKey(String id);

    int insert(MTemplate record);

    int insertSelective(MTemplate record);

    MTemplate selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MTemplate record);

    int updateByPrimaryKey(MTemplate record);

}
