package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Doacao
 *
 */
@Entity
@SequenceGenerator(name="doacao_id", sequenceName="doacao_seq", allocationSize=1 )
public class Doacao implements Serializable {


  private static final long serialVersionUID = 1L;
  @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="doacao_id")
	private Long id;
	private Date dataDoacao;
	private Doador doador;
	private Usuario legitimador; // pessoa que confirma que essa doacao aconteceu
	private CentroRecolhimento localDoacao;

	public Date getDataDoacao() {
		return dataDoacao;
	}

	public void setDataDoacao(Date dataDoacao) {
		this.dataDoacao = dataDoacao;
	}

	public Doador getDoador() {
		return doador;
	}

	public void setDoador(Doador doador) {
		this.doador = doador;
	}

	public Usuario getLegitimador() {
		return legitimador;
	}

	public void setLegitimador(Usuario legitimador) {
		this.legitimador = legitimador;
	}

	public CentroRecolhimento getLocalDoacao() {
		return localDoacao;
	}

	public void setLocalDoacao(CentroRecolhimento localDoacao) {
		this.localDoacao = localDoacao;
	}

	public Doacao() {
		super();
	}

}
