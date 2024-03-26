package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;

import java.nio.charset.StandardCharsets;
import java.io.IOException;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() throws IOException {
        Resource resource = new ClassPathResource("static/index.html");

        String htmlContent = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);

        return htmlContent;
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
