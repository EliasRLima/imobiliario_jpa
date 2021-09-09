package services;

import java.util.List;

import database.DaoAluguel;
import modelo.Aluguel;


public class AluguelService {
	private DaoAluguel dao;

	private SimpleEntityManager simpleEntityManager;

	public AluguelService(SimpleEntityManager simpleEntityManager){
	        this.simpleEntityManager = simpleEntityManager;
	        dao = new DaoAluguel(simpleEntityManager.getEntityManager());
	    }

	public void save(Aluguel aluguel) {
		try {
			simpleEntityManager.beginTransaction();
			aluguel.validate();
			dao.save(aluguel);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void remove(Aluguel aluguel) {
		try {
			simpleEntityManager.beginTransaction();
			aluguel.validate();
			dao.delete(aluguel);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public List<Aluguel> findAll() {
		return dao.findAll();
	}

	public void update(Aluguel aluguel) {
		try {
			simpleEntityManager.beginTransaction();
			aluguel.validate();
			dao.update(aluguel);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}
}
