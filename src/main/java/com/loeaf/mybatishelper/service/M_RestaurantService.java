package com.loeaf.mybatishelper.service;

import com.loeaf.mybatishelper.model.M_Restaurant;

import java.util.List;

public interface M_RestaurantService{


    int deleteByPrimaryKey(String id);

    int insert(M_Restaurant record);

    int insertSelective(M_Restaurant record);

    List<M_Restaurant> selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(M_Restaurant record);

    int updateByPrimaryKey(M_Restaurant record);

}
