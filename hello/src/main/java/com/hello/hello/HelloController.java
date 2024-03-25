package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.nio.charset.StandardCharsets;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Something Nyana";
    }

    @GetMapping("/login")
    public String login() {
        return "You redirected to Login";
    }

    @GetMapping("/signup")
    public String signUp() {
        return "You redirected to Sign Up";
    }
}
