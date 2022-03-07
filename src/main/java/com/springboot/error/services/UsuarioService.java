package com.springboot.error.services;

import java.util.List;

import com.springboot.error.modelos.Usuario;

public interface UsuarioService {

		public List<Usuario> listar();
		
		public Usuario obtenerPorId(Integer id);
		
}
