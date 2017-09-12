package controllers;

import services.UsuarioService;

public class UsuariosController {
	private UsuarioService usuarioService;

//	@route(value = "/users/{username}", method = "GET")
	public String show(String username) {
		if (usuarioService.isAutenticado()) {
			return "pagina do usuario";
		} else {
			return "pagina de cadastro";
		}
		
	}

}
