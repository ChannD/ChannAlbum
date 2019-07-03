package com.chann.album.controller;

import com.chann.album.entity.User;
import com.chann.album.repository.UserRepository;
import com.chann.album.utils.SimpleResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@Controller
public class HelloController {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;

    private RequestCache requestCache = new HttpSessionRequestCache();
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    private Logger logger = LoggerFactory.getLogger(getClass());




    @RequestMapping("success")
    public String success(){
        return "success";
    }

    @ResponseBody
    @RequestMapping("/personal_center")
    public void login(HttpServletRequest request) {
        System.out.println("登录成功");
    }

    @ResponseBody
    @PostMapping("/registry")
    public void registry(User user) {
        userRepository.save(new User(user.getUsername(), passwordEncoder.encode(user.getPassword())));
    }

    @RequestMapping("/sign_in")
    public String sign_in() {
        return "login";
    }

    @RequestMapping("/sign_up")
    public String sign_up() {
        return "registry";
    }
}
