package com.example.myspinjenkindemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {


    @GetMapping
    public String home() {
        return "<body style=\"background-color:green\">\n" +
                "    <h2>Hello, spinnaker!</h2>\n" +
                "</body>";
    }

}
