package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CertificadoDoacao
 *
 */
@Entity

public class CertificadoDoacao implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Doacao doacao;
	private CentroRecolhimento centroRecolhimento;
	private Date ultimaDataEmissao;
	
	public CertificadoDoacao() {
		super();
	}
   
}
