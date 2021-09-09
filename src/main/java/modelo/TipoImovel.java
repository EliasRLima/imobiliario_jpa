package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIPOIMOVEL")
public class TipoImovel {

	@Id @GeneratedValue
	private Integer id;
	private String descricao;
	
	public TipoImovel() {
		// TODO Auto-generated constructor stub
	}
	
	public TipoImovel(Integer id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public void validate() {
		if(id == null) {
			throw new IllegalArgumentException("Numero de identificacao nao deve ser null.");
		}
		if(descricao == null) {
			throw new IllegalArgumentException("Descricao nao pode ser vazia.");
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
}
