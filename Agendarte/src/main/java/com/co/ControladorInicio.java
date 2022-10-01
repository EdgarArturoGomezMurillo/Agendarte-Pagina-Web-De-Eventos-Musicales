package com.co;

import com.co.dao.usuarioDAO;
import com.co.pojo.usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorInicio {

    @Autowired
    private usuarioDAO usuarioDAO;

    @GetMapping("/")
    public String Inicio() {
        return "index";
    }

    @GetMapping("/login")
    public String iniciosesion() {
        return "iniciosesion";
    }

    @GetMapping("/formulario")
    public String formulario() {
        return "formulario";
    }

    @GetMapping("/loginadmin")
    public String loginadmin(Model model) {
        var usuarios = usuarioDAO.findAll();
        model.addAttribute("usuarios", usuarios);
        return "loginadmin";
    }

    @GetMapping("/registrar")
    public String registrar() {
        return "registrar";
    }

    @PostMapping("/guardar")
    public String guardar(usuario usuarios) {
        usuarioDAO.save(usuarios);
        return "redirect:/loginadmin";
    }

    @GetMapping("/editar/{idusuario}")
    public String editar(@PathVariable("idusuario") Integer idusuario, Model model) {
        var usuarios = usuarioDAO.findById(idusuario);
        model.addAttribute("usuarios", usuarios);
        return "modificar";

    }

    @GetMapping("/eliminar/{idusuario}")
    public String eliminar(@PathVariable("idusuario") Integer idusuario) {
        usuarioDAO.deleteById(idusuario);
        return "redirect:/loginadmin";

    }

}
