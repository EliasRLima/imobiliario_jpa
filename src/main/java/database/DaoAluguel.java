package database;

import javax.persistence.EntityManager;

import modelo.Aluguel;

public class DaoAluguel extends DaoGenerico<Long, Aluguel>{

	public DaoAluguel(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

}
