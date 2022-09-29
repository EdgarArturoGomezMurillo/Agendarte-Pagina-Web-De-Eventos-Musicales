/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Diego Gomez
 */
@Controller
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(){
        return "index";
    }
    
    @GetMapping("/formulario")
    public String formulario(){
        return "formulario";
}
}
