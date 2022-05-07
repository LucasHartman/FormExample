package com.example.registrationFrom.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
--  this clas
-   Maps jSP file

@GetMapping         maps HTTP GET request onto specific handler method(showAddress

--  Source: https://www.codejava.net/frameworks/spring-boot/spring-boot-form-handling-tutorial-with-spring-form-tags-and-jsp
 */

@Controller
public class Control {
    @RequestMapping("/")
    public String home() {
        System.out.println("Going home...");
        return "index"; // name JSP file
    }
}