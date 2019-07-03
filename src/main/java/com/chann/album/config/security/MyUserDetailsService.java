package com.chann.album.config.security;

import com.chann.album.entity.Role;
import com.chann.album.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) {
        com.chann.album.entity.User user = userRepository.findByUsername(s);
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        for (Role role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority("admin"));
//        }
        return new User(user.getUsername()
                ,  user.getPassword()
                ,true, true, true ,true
                , authorities);
    }
}
