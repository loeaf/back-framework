package com.loeaf.mybatishelper.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.loeaf.mybatishelper.model.M_Restaurant;
import com.loeaf.mybatishelper.mapper.M_RestaurantMapper;
import com.loeaf.mybatishelper.service.M_RestaurantService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class M_RestaurantServiceImpl implements M_RestaurantService{

    @Resource
    private M_RestaurantMapper m_RestaurantMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return m_RestaurantMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(M_Restaurant record) {
        return m_RestaurantMapper.insert(record);
    }

    @Override
    public int insertSelective(M_Restaurant record) {
        return m_RestaurantMapper.insertSelective(record);
    }

    @Override
    public List<M_Restaurant> selectByPrimaryKey(String id) {
        return m_RestaurantMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(M_Restaurant record) {
        return m_RestaurantMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(M_Restaurant record) {
        return m_RestaurantMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<M_Restaurant> selectData(List<String> dates, List<String> times) {
        // List<String> to List<LocalDateTime>
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        List<LocalDateTime> dateList = dates.stream().map(date -> LocalDateTime.parse(date, formatter)).collect(Collectors.toList());
        // times is List<String> to List<Integer>
        List<Integer> timesInt = times.stream().map(Integer::parseInt).collect(Collectors.toList());
        return m_RestaurantMapper.selectData(dateList, timesInt);
    }

}
