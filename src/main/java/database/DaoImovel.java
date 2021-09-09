package database;

import javax.persistence.EntityManager;

import modelo.Imovel;

public class DaoImovel extends DaoGenerico<Long, Imovel>{

	public DaoImovel(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
   
}
