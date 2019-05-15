package com.weilong.webpractise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowController {
    @GetMapping("/")
    public String show(Model model) { return "index"; }
}
