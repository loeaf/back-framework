package com.loeaf.mybatishelper.controller;
import com.loeaf.mybatishelper.model.MTemplate;
import com.loeaf.mybatishelper.service.impl.MTemplateServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/template")
public class MTemplateController {
@Resource
private MTemplateServiceImpl mTemplateServiceImpl;

@GetMapping("selectOne")
public MTemplate selectOne(String id) {
return mTemplateServiceImpl.selectByPrimaryKey(id);
}

}
