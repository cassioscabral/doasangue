package entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
@Inheritance(strategy=InheritanceType.JOINED)
@Entity
@SequenceGenerator(name="usuario_id", sequenceName="usuario_seq", allocationSize=1 )
public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usuario_id")
	private Long id;
	private String login;
	private String senha;
	private boolean administrador;
//	@ManyToMany(targetEntity=CentroRecolhimento.class)
//	private ArrayList<CentroRecolhimento> cRecolhimentoResponsaveis;
	
	@Embedded
	private Endereco endereco;
	
	@Embedded
	private Contato contato;


	public Contato getContato() {
		return contato;
	}



	public void setContato(Contato contato) {
		this.contato = contato;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}


}
