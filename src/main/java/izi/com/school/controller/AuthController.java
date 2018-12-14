package izi.com.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/auth")
public class AuthController {

    @RequestMapping(value="/login")
    public String error403() {

        return "default/error403";
    }
}
