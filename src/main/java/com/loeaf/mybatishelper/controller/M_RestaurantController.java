package com.loeaf.mybatishelper.controller;
import com.loeaf.mybatishelper.dto.param.M_RestaurantParam;
import com.loeaf.mybatishelper.model.M_Restaurant;
import com.loeaf.mybatishelper.service.impl.M_RestaurantServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class M_RestaurantController {
    @Resource
    private M_RestaurantServiceImpl m_RestaurantServiceImpl;

    @GetMapping("selectOne")
    public List<M_Restaurant> selectOne(@RequestParam(required = false) String id) {
        var result = m_RestaurantServiceImpl.selectByPrimaryKey(id);
        System.out.println("====================================");
        System.out.println(result);
        System.out.println("====================================");
    return result;
    }

    @PostMapping("selectData")
    public List<M_Restaurant> selectData(
            @RequestBody M_RestaurantParam param
    ) {
        var result = m_RestaurantServiceImpl.selectData(param.getDateList(), param.getTimes());
        System.out.println("====================================");
        System.out.println(result);
        System.out.println("====================================");
        return result;
    }
}
