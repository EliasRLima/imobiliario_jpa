package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ALUGUEIS")
public class Aluguel {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer idLocacao;
	private String dtVencimento;
	private Double valorPago;
	private String text;
	
	public Aluguel() {
		// TODO Auto-generated constructor stub
	}

	public Aluguel(Integer id, Integer idLocacao, String dtVencimento, Double valorPago, String text) {
		super();
		this.id = id;
		this.idLocacao = idLocacao;
		this.dtVencimento = dtVencimento;
		this.valorPago = valorPago;
		this.text = text;
	}
	
	public void validate() {
		if(idLocacao == null) {
			throw new IllegalArgumentException("A locacao nao pode ser null!");
		}
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdLocacao() {
		return idLocacao;
	}

	public void setIdLocacao(Integer idLocacao) {
		this.idLocacao = idLocacao;
	}

	public String getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(String dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
