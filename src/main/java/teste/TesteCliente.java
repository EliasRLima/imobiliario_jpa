package teste;

import modelo.Cliente;
import services.ClienteService;
import services.SimpleEntityManager;

public class TesteCliente {
	public void teste() {
		String persistenceUnitName = "Testes";
        
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);
         
        ClienteService clienteService = new ClienteService(simpleEntityManager);
         
        Cliente cliente1 = new Cliente(1, 
        						      "Junior do Pneu", 
        						      "12345678901", 
        						      "98 ", 
        						      "", 
        						      "junin@email", 
        						      "10-10-1999");	
        
        Cliente cliente2 = new Cliente(2, 
			      					   "Thais", 
			      					   "12312312312", 
			      					   "98 3452-3542", 
			      					   "", 
			      					   "thais@email", 
			      					   "24-10-1887");
        
        Cliente cliente3 = new Cliente(3, 
			      	                   "Flavin", 
			      	                   "09876543210", 
			      	                   "99 1234-4321", 
			      	                   "", 
			      	                   "junin@email", 
			      					   "10-10-1999");
        
        //listar antes
        for(Cliente c : clienteService.findAll()){
            System.out.println(c.getNome_cliente());
        }
         
        clienteService.save(cliente1);
        clienteService.save(cliente2);
        clienteService.save(cliente3);
         
        //listar apos insert
        for(Cliente c : clienteService.findAll()){
            System.out.println(c.getNome_cliente());
        }
         
        clienteService.remove(cliente2);
       
        cliente3.setNome_cliente("Flavio");
        clienteService.update(cliente3);
        
        //listar apos crud
        for(Cliente c : clienteService.findAll()){
            System.out.println(c.getNome_cliente());
        }
       
       simpleEntityManager.close();
	}
}
