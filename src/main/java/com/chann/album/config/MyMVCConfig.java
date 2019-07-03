package com.chann.album.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MyMVCConfig extends WebMvcConfigurationSupport {
//public class MyMVCConfig implements WebMvcConfigurer {



    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }




//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginRequiredInterceptor()).excludePathPatterns(Arrays.asList("/views/**", "/res/**"));
//    }



//    @Bean
//    public WebMvcConfigurationSupport webMvcConfigurationSupport(){
//        WebMvcConfigurationSupport webMvcConfigurationSupport = new WebMvcConfigurationSupport() {
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("album");
//                registry.addViewController("/index.html").setViewName("album");
////                registry.addViewController("/sign_in").setViewName("login");
////                registry.addViewController("/sign_up").setViewName("registry");
//            }
//
//
//        };
//
//        return webMvcConfigurationSupport;
//    }
}
