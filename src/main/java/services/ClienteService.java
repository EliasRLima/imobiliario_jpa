package services;

import java.util.List;

import database.DaoCliente;
import modelo.Cliente;

public class ClienteService {
	  private DaoCliente dao;
	  
	  private SimpleEntityManager simpleEntityManager;
	     
	    public ClienteService(SimpleEntityManager simpleEntityManager){
	        this.simpleEntityManager = simpleEntityManager;
	        dao = new DaoCliente(simpleEntityManager.getEntityManager());
	    }
	     
	    public void save(Cliente cliente){
	        try{
	            simpleEntityManager.beginTransaction();
	            cliente.validate();
	            dao.save(cliente);
	            simpleEntityManager.commit();
	        }catch(Exception e){
	            e.printStackTrace();
	            simpleEntityManager.rollBack();
	        }
	    }
	     
	    public List<Cliente> findAll(){
	        return dao.findAll();
	    }
}
