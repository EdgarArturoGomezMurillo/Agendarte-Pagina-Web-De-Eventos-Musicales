//package edu.grupo05.agendarte.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//public class LoginController {
//    @GetMapping("/delete") public String delete()
//    {
//        return "This is the delete request";
//    }
//}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.grupo05.agendarte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Diego Gomez
 */
@Controller
public class LoginController {

    @GetMapping("/index")
    public String inicio(){
        return "index";
    }

    @GetMapping("/formulario")
    public String formulario(){
        return "formulario";
    }
}

