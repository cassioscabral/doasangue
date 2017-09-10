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
  	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDoacao;
  	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USUARIO_ID")
	private Doador doador;
	private Usuario legitimador; // pessoa que confirma que essa doacao aconteceu
	@ManyToOne
	private CentroRecolhimento localDoacao;
	@OneToOne(fetch=FetchType.LAZY, mappedBy="doacao")
	private CertificadoDoacao certificado;

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

	public CertificadoDoacao getCertificado() {
		return certificado;
	}

	public void setCertificado(CertificadoDoacao certificado) {
		this.certificado = certificado;
	}

}
