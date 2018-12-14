package izi.com.school.controller;

import izi.com.school.model.Utilisateur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/app")
public class AppController {

    @RequestMapping(value="/formations")
    public String formations() {
        //return "admin/dashbord";
        //ModelAndView view = new ModelAndView("default/error403");
        return "done la liste des formation";
    }
}
