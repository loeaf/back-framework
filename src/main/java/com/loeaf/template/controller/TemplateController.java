package com.loeaf.template.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@RestController
@RequestMapping("/template")
public class TemplateController {
    @GetMapping("")
    public String templateGetParam(HttpServletRequest request, HttpServletResponse response, @RequestParam String id) {
        return id;
    }
    @PostMapping("")
    public String templatePostBody(HttpServletRequest request, HttpServletResponse response, @RequestBody HashMap id) {
        return "template";
    }
}
