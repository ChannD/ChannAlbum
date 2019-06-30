package com.chann.album.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("c很虚启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("chengxu效果");
    }
}
