package com.codegym.blog.model.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CreateBCryptPass {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123456"));
    }
}
