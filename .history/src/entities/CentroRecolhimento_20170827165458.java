package entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

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
	private ArrayList<Usuario> responsaveis;


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



	public ArrayList<Usuario> getResponsaveis() {
		return responsaveis;
	}



	public void setResponsaveis(ArrayList<Usuario> responsaveis) {
		this.responsaveis = responsaveis;
	}



	public CentroRecolhimento() {
		super();
	}

}
