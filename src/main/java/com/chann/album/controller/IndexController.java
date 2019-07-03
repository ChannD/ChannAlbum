package com.chann.album.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("album")
    public ModelAndView album(){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("album");
        return mv;
    }
}
