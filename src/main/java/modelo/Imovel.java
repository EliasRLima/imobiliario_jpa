package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "IMOVEL")
public class Imovel {
	@Id
	@GeneratedValue

	private Integer id;
	private String endereco;
	private Integer dormitorios;
	private Integer banheiros;
	private Integer suites;
	private Integer metragem;
	private double valor_aluguel_sugerido;
	private Cliente proprietario;
	private TipoImovel tipo_imovel;

	public Imovel() {
		// TODO Auto-generated constructor stub
	}

	public Imovel(Integer id, String endereco, Integer dormitorios, Integer banheiros, Integer suites, Integer metragem,
			double valor_aluguel_sugerido, Cliente proprietario, TipoImovel tipo_imovel) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.dormitorios = dormitorios;
		this.banheiros = banheiros;
		this.suites = suites;
		this.metragem = metragem;
		this.valor_aluguel_sugerido = valor_aluguel_sugerido;
		this.proprietario = proprietario;
		this.tipo_imovel = tipo_imovel;
	}
	
	public void validate() {
		if(proprietario == null) {
			throw new IllegalArgumentException("O imovel deve ter um proprietario.");
		}
		
		if(tipo_imovel == null) {
			throw new IllegalArgumentException("O tipo nao pode ser null.");
		}
		
		if(endereco == null) {
			throw new IllegalArgumentException("O endereco nao pode ser null.");
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getDormitorios() {
		return dormitorios;
	}

	public void setDormitorios(Integer dormitorios) {
		this.dormitorios = dormitorios;
	}

	public Integer getBanheiros() {
		return banheiros;
	}

	public void setBanheiros(Integer banheiros) {
		this.banheiros = banheiros;
	}

	public Integer getSuites() {
		return suites;
	}

	public void setSuites(Integer suites) {
		this.suites = suites;
	}

	public Integer getMetragem() {
		return metragem;
	}

	public void setMetragem(Integer metragem) {
		this.metragem = metragem;
	}

	public double getValor_aluguel_sugerido() {
		return valor_aluguel_sugerido;
	}

	public void setValor_aluguel_sugerido(double valor_aluguel_sugerido) {
		this.valor_aluguel_sugerido = valor_aluguel_sugerido;
	}

	public Cliente getProprietario() {
		return proprietario;
	}

	public void setProprietario(Cliente proprietario) {
		this.proprietario = proprietario;
	}

	public TipoImovel getTipo_imovel() {
		return tipo_imovel;
	}

	public void setTipo_imovel(TipoImovel tipo_imovel) {
		this.tipo_imovel = tipo_imovel;
	}
	
	
}
