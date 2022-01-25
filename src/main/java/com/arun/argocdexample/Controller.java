package com.arun.argocdexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${app.name}")
    private String name;


    @Value("${app.teamName}")
    private String teamName;

    @RequestMapping(path = "/")
    public String greetings() {
        return "Hello all, This is " + name + " from team " + teamName;
    }
}
