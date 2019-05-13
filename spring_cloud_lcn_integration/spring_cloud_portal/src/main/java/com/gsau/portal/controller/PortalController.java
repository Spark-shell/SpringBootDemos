package com.gsau.portal.controller;

import com.gsau.portal.portal.service.PortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PortalController {
    @Autowired
    private PortalService portalService;
    @RequestMapping("/addOrder")
    public Map<String, String> addOrder() {
        portalService.addOrder();
        Map<String, String> map = new HashMap<>();
        map.put("msg", "data insert success");
        return map;
    }
    @RequestMapping("/test")
    public String access() {
        return "访问成功";
    }
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
    }
}
