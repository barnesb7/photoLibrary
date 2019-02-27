package com.detroitlabs.photolibrary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhotoController {

    @RequestMapping("/")
    public String displayHome(){
        return "home";
    }


}
