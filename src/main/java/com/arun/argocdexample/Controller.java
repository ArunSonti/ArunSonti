package com.arun.argocdexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(path = "/")
    public String greetings() {
        return "Hello from Arun";
    }
}
