package database;

import javax.persistence.EntityManager;

import modelo.Locacao;

public class DaoLocacao extends DaoGenerico<Long, Locacao>{

	public DaoLocacao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

}
