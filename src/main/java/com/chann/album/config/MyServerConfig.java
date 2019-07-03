package com.chann.album.config;

import com.chann.album.filter.MyFilter;
import com.chann.album.listener.MyListener;
import com.chann.album.servlet.MyServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.Arrays;

//@Configuration
public class MyServerConfig {

//    @Bean
//    public ServletRegistrationBean myServlet(){
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(), "/myServlet");
//        return servletRegistrationBean;
//    }

    /**
     * 注册一个filter
     * @return
     */
//    @Bean
//    public FilterRegistrationBean myFilter(){
//        FilterRegistrationBean filterFilterRegistrationBean = new FilterRegistrationBean();
//        filterFilterRegistrationBean.setFilter(new MyFilter());
//        filterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/hello", "/myServlet"));
//        return filterFilterRegistrationBean;
//    }

    /**
     * 注册一个linsener
     * @return
     */
//    @Bean
//    public ServletListenerRegistrationBean myListener(){
//        ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>(new MyListener());
//        return registrationBean;
//    }

    /**
     * 配置嵌入式Web容器
     * @return
     */
//    @Bean
//    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
//        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
//            @Override
//            public void customize(ConfigurableWebServerFactory factory) {
////                factory.setPort(8085);
//            }
//        };
//    }
}
