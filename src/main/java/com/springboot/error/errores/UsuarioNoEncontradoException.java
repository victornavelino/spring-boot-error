package com.springboot.error.errores;

public class UsuarioNoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UsuarioNoEncontradoException(String id) {
		super("Usuario con Id: ".concat(id).concat(" No esiste en el sistema"));
	}
	
	

}
