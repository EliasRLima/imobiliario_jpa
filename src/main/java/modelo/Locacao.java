package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOCACAO")
public class Locacao {

	@Id @GeneratedValue
	private Integer id;
	private Integer ativo;
	private String dataInicio;
	private String dataFim;
	private Integer diaVencimento;
	private Double valorAluguel;
	private String obs;
	private Imovel imovel;
	private Cliente inquilino;
	
	public Locacao() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Locacao(Integer id, Integer ativo, String dataInicio, String dataFim, Integer diaVencimento,
			Double valorAluguel, String obs, Imovel imovel, Cliente inquilino) {
		super();
		this.id = id;
		this.ativo = ativo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.diaVencimento = diaVencimento;
		this.valorAluguel = valorAluguel;
		this.obs = obs;
		this.imovel = imovel;
		this.inquilino = inquilino;
	}



	public void validate() {
		if(dataInicio == null) {
			throw new IllegalArgumentException("Data de inicio nao pode ser vazia.");
		}	
		if(imovel == null) {
			throw new IllegalArgumentException("Imovel nao pode ser vazio.");
		}
		if(inquilino == null) {
			throw new IllegalArgumentException("Inquilino nao pode ser vazio.");
		}
	}	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public Integer getDiaVencimento() {
		return diaVencimento;
	}

	public void setDiaVencimento(Integer diaVencimento) {
		this.diaVencimento = diaVencimento;
	}

	public Double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(Double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public Cliente getInquilino() {
		return inquilino;
	}

	public void setInquilino(Cliente inquilino) {
		this.inquilino = inquilino;
	}
	
	
	
	
}
