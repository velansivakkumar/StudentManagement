package com.techeazy.schoolmanagement;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("student".equals(username)) {
            return User.withUsername("student")
                       .password("{noop}password") // {noop} means no password encoding
                       .roles("STUDENT")
                       .build();
        } else if ("admin".equals(username)) {
            return User.withUsername("admin")
                       .password("{noop}password")
                       .roles("ADMIN")
                       .build();
        }
        throw new UsernameNotFoundException("User not found");
    }
}
