package entities;

import entities.Usuario;
import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Doador
 *
 */
@Entity
public class Doador extends Usuario implements Serializable {


    private static final long serialVersionUID = 1L;
	private String nomeCompleto;
	private String RG;
	private String tipoSanguineo;
	private String CPF;
	
	@OneToMany( targetEntity=Doacao.class )
    private ArrayList<Doacao> doacoes;

	public ArrayList<Doacao> getDoacoes() {
		return doacoes;
	}


	public void setDoacoes(ArrayList<Doacao> doacoes) {
		this.doacoes = doacoes;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public String getRG() {
		return RG;
	}


	public void setRG(String rG) {
		RG = rG;
	}


	public String getTipoSanguineo() {
		return tipoSanguineo;
	}


	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public Doador() {
		super();
	}

}
