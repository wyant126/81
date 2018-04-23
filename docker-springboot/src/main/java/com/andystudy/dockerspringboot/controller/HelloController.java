package com.andystudy.dockerspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author andy
 * @description ${DESCRIPTION}
 * @since 2018-04-13 14:28
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, SpringBoot!";
    }
}
