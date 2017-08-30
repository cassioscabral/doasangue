package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: CertificadoDoacao
 *
 */
@Entity
@SequenceGenerator(name="certificado_doacao_id", sequenceName="certificado_doacao_seq", allocationSize=1 )
public class CertificadoDoacao implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="certificado_doacao_id")
	private Long id;
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOACAO_ID")
	private Doacao doacao;
	private CentroRecolhimento centroRecolhimento;
	@Temporal(TemporalType.TIMESTAMP)
	private Date ultimaDataEmissao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Doacao getDoacao() {
		return doacao;
	}

	public void setDoacao(Doacao doacao) {
		this.doacao = doacao;
	}

	public CentroRecolhimento getCentroRecolhimento() {
		return centroRecolhimento;
	}

	public void setCentroRecolhimento(CentroRecolhimento centroRecolhimento) {
		this.centroRecolhimento = centroRecolhimento;
	}

	public Date getUltimaDataEmissao() {
		return ultimaDataEmissao;
	}

	public void setUltimaDataEmissao(Date ultimaDataEmissao) {
		this.ultimaDataEmissao = ultimaDataEmissao;
	}

	public CertificadoDoacao() {
		super();
	}

}
