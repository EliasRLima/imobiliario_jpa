package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COSTUMER")
public class Cliente {
	@Id
	@GeneratedValue
	private int id;
	private String nome_cliente;
	private String cpf;
	private String telefone1;
	private String telefone2;
	private String email;
	private String dt_nascimento;

	public Cliente() {
		super();
	}

	public Cliente(int id, String nome_cliente, String cpf, String telefone1, String telefone2, String email,
			String dt_nascimento) {
		super();
		this.id = id;
		this.nome_cliente = nome_cliente;
		this.cpf = cpf;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.email = email;
		this.dt_nascimento = dt_nascimento;
	}

	public void validate() {
		if (nome_cliente == null) {
			throw new IllegalArgumentException("Nome nao pode ser vazio.");
		}

		if (cpf == null) {
			throw new IllegalArgumentException("Cpf nao pode ser vazio.");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

}
