package entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contato
 *
 */
@Embeddable
public class Contato implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private ArrayList<String> telefonesContato;
	private String email;
	private ArrayList<String> redesSociais;

	public ArrayList<String> getTelefonesContato() {
		return telefonesContato;
	}

	public void setTelefonesContato(ArrayList<String> telefonesContato) {
		this.telefonesContato = telefonesContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<String> getRedesSociais() {
		return redesSociais;
	}

	public void setRedesSociais(ArrayList<String> redesSociais) {
		this.redesSociais = redesSociais;
	}

	public Contato() {
		super();
	}
   
}
