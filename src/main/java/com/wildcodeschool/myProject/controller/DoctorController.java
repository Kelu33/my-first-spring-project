package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    @GetMapping("/doctor/1")
    @ResponseBody
    public String doctorOne() {
        return "<a href='/'>Home</a><br>William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String doctorTeen() {
        return "<a href='/'>Home</a><br>David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String doctorThirteen() {
        return "<a href='/'>Home</a><br>Jodie Whittaker";
    }
}
