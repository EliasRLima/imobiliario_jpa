package database;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;

import modelo.Cliente;

public class DaoCliente extends DaoGenerico<Long, Cliente>{

	public DaoCliente(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

}
