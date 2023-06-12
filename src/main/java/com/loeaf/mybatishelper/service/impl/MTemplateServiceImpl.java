package com.loeaf.mybatishelper.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.loeaf.mybatishelper.model.MTemplate;
import com.loeaf.mybatishelper.mapper.MTemplateMapper;
import com.loeaf.mybatishelper.service.MTemplateService;
@Service
public class MTemplateServiceImpl implements MTemplateService{

    @Resource
    private MTemplateMapper mTemplateMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return mTemplateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MTemplate record) {
        return mTemplateMapper.insert(record);
    }

    @Override
    public int insertSelective(MTemplate record) {
        return mTemplateMapper.insertSelective(record);
    }

    @Override
    public MTemplate selectByPrimaryKey(String id) {
        return mTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MTemplate record) {
        return mTemplateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MTemplate record) {
        return mTemplateMapper.updateByPrimaryKey(record);
    }

}
