package com.springboot.error.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.error.modelos.Usuario;
import com.springboot.error.services.UsuarioService;

@Controller
public class AppController {
	
	@Autowired
	private UsuarioService usuarioService;

	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String index() {
		//Integer numero = 100/0;
		Integer numerotrucho = Integer.parseInt("10x");
	return "index";	
	}
	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id, Model model) {
		Usuario usuario = usuarioService.obtenerPorId(id);
		model.addAttribute("usuario",usuario);
		model.addAttribute("titulo", "Detalle usuario: ".concat(usuario.getNombre()));
		return "ver";
	}
	
}
