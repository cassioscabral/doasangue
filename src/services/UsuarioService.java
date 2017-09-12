package services;

import entities.Usuario;

public interface UsuarioService {
	
    Usuario encontrarPorLogin(String username);

    boolean emailExiste(String email);

    boolean usernameExiste(String username);

    void registrar(Usuario usuario);

    void mudarEmail(String novoEmail, String passwordAtual) throws Exception;

    void mudarPassword(String novaSenha, String passwordAtual) throws Exception;

    void autenticar(Usuario usuario);

    boolean isAutenticado();

    boolean isAdmin();

    Usuario usuarioAtual();

}