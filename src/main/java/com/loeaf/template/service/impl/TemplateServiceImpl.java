package com.loeaf.template.service.impl;

import com.loeaf.common.misc.ServiceImpl;
import com.loeaf.template.model.Template;
import com.loeaf.template.repository.TemplateRepository;
import com.loeaf.template.service.TemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.engine.TemplateManager;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class TemplateServiceImpl extends ServiceImpl<TemplateRepository, Template, String> implements TemplateService {
    private final TemplateRepository templateRepository;

    @PostConstruct
    private void init() {
        super.set(templateRepository, new Template());
    }
}
