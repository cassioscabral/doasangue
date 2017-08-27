package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

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
	private Doacao doacao;
	private CentroRecolhimento centroRecolhimento;
	private Date ultimaDataEmissao;

	public CertificadoDoacao() {
		super();
	}

}
