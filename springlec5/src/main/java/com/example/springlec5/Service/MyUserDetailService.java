package com.example.springlec5.Service;

import com.example.springlec5.Entities.MyUser;
import com.example.springlec5.Entities.UserRoles;
import com.example.springlec5.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;


public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUser user =  repository.findByUsername(username);
        List<String> roles =  new ArrayList<>();

        for (UserRoles role : user.getUserRoles()){
            roles.add(role.getRole());
        }

        UserBuilder userBuilder = org.springframework.security.core.userdetails.User.withUsername(username);
        UserDetails userDetails =  userBuilder
                .username(user.getUsername())
                .password(new BCryptPasswordEncoder().encode(user.getPassword()))
                .roles(roles.toArray(new String[roles.size()]))
                .build();
        return userDetails;
    }
}