package com.ucode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {

    @GetMapping("/openProfile")
    public String openProfilePage(Model model) {

        String name = "Ukarsh Yadav";
        model.addAttribute("modelName", name);
        return "profile";
    }

    @GetMapping("/openConditional")
    public String openConditionalPage(Model model){

        int a= 10;
        int b= 20;
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        return "conditional";
    }

    @GetMapping("/openLooping")
    public String openLoopingPage(Model model){


        model.addAttribute("list", List.of(1,2,3,4,5));
        return "looping";
    }
}
