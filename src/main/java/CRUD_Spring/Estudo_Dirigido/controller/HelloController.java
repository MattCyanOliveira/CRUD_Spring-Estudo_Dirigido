package CRUD_Spring.Estudo_Dirigido.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return " Hello, Spring Boot ^-^ ";
    }
}