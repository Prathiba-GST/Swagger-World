package com.javaguides.springbootapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonalInformationController {
    @GetMapping("/Name")
    public String Name(){
        return "Prathiba";
    }
}
