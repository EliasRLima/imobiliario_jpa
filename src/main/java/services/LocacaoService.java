package services;

import java.util.List;

import database.DaoLocacao;
import modelo.Locacao;

public class LocacaoService {
	private DaoLocacao dao;

	private SimpleEntityManager simpleEntityManager;

	public LocacaoService(SimpleEntityManager simpleEntityManager){
	        this.simpleEntityManager = simpleEntityManager;
	        dao = new DaoLocacao(simpleEntityManager.getEntityManager());
	    }

	public void save(Locacao locacao) {
		try {
			simpleEntityManager.beginTransaction();
			locacao.validate();
			dao.save(locacao);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void remove(Locacao locacao) {
		try {
			simpleEntityManager.beginTransaction();
			locacao.validate();
			dao.delete(locacao);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public List<Locacao> findAll() {
		return dao.findAll();
	}

	public void update(Locacao locacao) {
		try {
			simpleEntityManager.beginTransaction();
			locacao.validate();
			dao.update(locacao);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}
}
