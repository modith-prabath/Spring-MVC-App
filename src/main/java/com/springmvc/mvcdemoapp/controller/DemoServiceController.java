package com.springmvc.mvcdemoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.mvcdemoapp.service.DemoService;

@Controller
public class DemoServiceController {

  private DemoService demoService ; 

  
  @Autowired
  public void setDemoService(DemoService demoService) {
    this.demoService = demoService;
  }

  @RequestMapping({ "/", " " })
  public String useService(Model model) {
    model.addAttribute("service", demoService.getService());
    return "index";
  }

}
