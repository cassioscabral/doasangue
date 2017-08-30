package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Campanha
 *
 */
@Entity
@SequenceGenerator(name="campanha_id", sequenceName="campanha_seq", allocationSize=1 )
public class Campanha implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="campanha_id")
	private Long id;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USUARIO_ID")
	private Usuario criador;
	private Usuario aprovador;
	private List<CentroRecolhimento> locaisDoacao;
	private boolean aprovada;
	// TODO
	// nome campanha
	// data inicio
	// data fim
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	public Usuario getCriador() {
		return criador;
	}



	public void setCriador(Usuario criador) {
		this.criador = criador;
	}



	public Usuario getAprovador() {
		return aprovador;
	}



	public void setAprovador(Usuario aprovador) {
		this.aprovador = aprovador;
	}



	public List<CentroRecolhimento> getLocaisDoacao() {
		return locaisDoacao;
	}



	public void setLocaisDoacao(List<CentroRecolhimento> locaisDoacao) {
		this.locaisDoacao = locaisDoacao;
	}



	public boolean isAprovada() {
		return aprovada;
	}



	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}



	public Campanha() {
		super();
	}
   
}
