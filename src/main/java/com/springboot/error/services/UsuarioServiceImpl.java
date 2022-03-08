package com.springboot.error.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.error.modelos.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Elian", "Navelino"));
		this.lista.add(new Usuario(2, "Emi", "Navelino"));
		this.lista.add(new Usuario(3, "Huguito", "Navelino"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario usuario = null;
		for (Usuario user : this.lista) {
			if (user.getId().equals(id)) {
				usuario = user;
				break;
			}

		}
		return usuario;
	}

}
