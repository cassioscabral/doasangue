package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TemplateEmail
 *
 */
@Embeddable
public class TemplateEmail implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@OneToOne
	private Campanha campanha;
	private String template;
	
	public Campanha getCampanha() {
		return campanha;
	}

	public void setCampanha(Campanha campanha) {
		this.campanha = campanha;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public TemplateEmail() {
		super();
	}
   
}
