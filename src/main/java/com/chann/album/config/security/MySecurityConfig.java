package com.chann.album.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter{
    @Bean
    UserDetailsService detailsService() {
        return new MyUserDetailsService();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(detailsService()).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers()
                .and().authorizeRequests()
                .antMatchers("/registry").permitAll()
                .antMatchers("/static/**").permitAll()
                .antMatchers("/static/cover/**").permitAll()
                .anyRequest().authenticated()
                .antMatchers("*.js").permitAll()

                .and().formLogin().loginPage("/sign_in")
                .loginProcessingUrl("/login").defaultSuccessUrl("/personal_center",true)
                .failureUrl("/sign_in?error").permitAll()
                .and().sessionManagement().invalidSessionUrl("/sign_in")
                .and().rememberMe().tokenValiditySeconds(1209600)
                .and().logout().logoutSuccessUrl("/sign_in").permitAll()
                .and().csrf().disable();
        http.headers().frameOptions().sameOrigin();
    }

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/registry");
        web.ignoring().antMatchers("/sign_up");
        web.ignoring().antMatchers("/sign_in");
        web.ignoring().antMatchers("/album");
        web.ignoring().antMatchers("/cover/js/**");
        web.ignoring().antMatchers("/config/**", "/css/**", "/fonts/**", "/img/**", "/js/**");

    }
}
