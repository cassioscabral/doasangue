package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 * Entity implementation class for Entity: CentroRecolhimento
 *
 */
@Entity
@SequenceGenerator(name="centro_recolhimento_id", sequenceName="centro_recolhimento_seq", allocationSize=1 )
public class CentroRecolhimento implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="centro_recolhimento_id")
	private Long id;
	private Float latitude;
	private Float longitude;
//	@ManyToMany(targetEntity=Usuario.class)
	private List<Usuario> responsaveis;
	@OneToMany(mappedBy = "localDoacao")
	private List<Doacao> doacoes;
	
	@Embedded
	private Endereco endereco;
	
	@Embedded
	private Contato contato;

	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public List<Doacao> getDoacoes() {
		return doacoes;
	}



	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}



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



	public Float getLatitude() {
		return latitude;
	}



	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}



	public Float getLongitude() {
		return longitude;
	}



	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}



	public List<Usuario> getResponsaveis() {
		return responsaveis;
	}



	public void setResponsaveis(List<Usuario> responsaveis) {
		this.responsaveis = responsaveis;
	}



	public CentroRecolhimento() {
		super();
	}

}
