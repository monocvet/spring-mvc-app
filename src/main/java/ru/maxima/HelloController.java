package ru.maxima;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// localhost:8080

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello-world";
    }

    @GetMapping("/hello-user")
    public String sayHelloUser() {
        return "hello-user";
    }


}
