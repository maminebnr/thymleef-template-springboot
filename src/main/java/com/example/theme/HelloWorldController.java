package com.example.theme;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String Hello(Model model){
        model.addAttribute("message", "hello GLSI E BYE !");
        return "helloworld";
    }
    
}
