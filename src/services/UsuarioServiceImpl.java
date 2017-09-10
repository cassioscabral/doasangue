package services;

import entities.Usuario;

public class UsuarioServiceImpl implements UsuarioService {

	@Override
	public Usuario encontrarPorLogin(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean emailExiste(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean usernameExiste(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registrar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mudarEmail(String novoEmail, String passwordAtual) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mudarPassword(String novaSenha, String passwordAtual) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void autenticar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAutenticado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAdmin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario usuarioAtual() {
		// TODO Auto-generated method stub
		return null;
	}

}
