package services;

import java.util.List;

import database.DaoImovel;
import modelo.Imovel;


public class ImovelService {
	private DaoImovel dao;

	private SimpleEntityManager simpleEntityManager;

	public ImovelService(SimpleEntityManager simpleEntityManager){
	        this.simpleEntityManager = simpleEntityManager;
	        dao = new DaoImovel(simpleEntityManager.getEntityManager());
	    }

	public void save(Imovel imovel) {
		try {
			simpleEntityManager.beginTransaction();
			imovel.validate();
			dao.save(imovel);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void remove(Imovel imovel) {
		try {
			simpleEntityManager.beginTransaction();
			imovel.validate();
			dao.delete(imovel);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public List<Imovel> findAll() {
		return dao.findAll();
	}

	public void update(Imovel imovel) {
		try {
			simpleEntityManager.beginTransaction();
			imovel.validate();
			dao.update(imovel);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}
}
