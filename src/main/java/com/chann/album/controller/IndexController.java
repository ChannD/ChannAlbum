package com.chann.album.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    /**
     * 首页展示开放式相册
     * @return
     */
    @RequestMapping("album")
    public ModelAndView album(){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("album");
        return mv;
    }

    /**
     * 系统的后台关系模块
     * @return
     */
    @RequestMapping("admin")
    public ModelAndView admin(){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("admin/index");
        return mv;
    }

    @RequestMapping("welcome")
    public ModelAndView welcome(){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("admin/welcome");
        return mv;
    }
}
