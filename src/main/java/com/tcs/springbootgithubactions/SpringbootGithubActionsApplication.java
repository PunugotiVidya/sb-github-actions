package com.tcs.springbootgithubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGithubActionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGithubActionsApplication.class, args);
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Hello World!";
    }

}
