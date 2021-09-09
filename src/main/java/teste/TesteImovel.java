package teste;


import modelo.Cliente;
import modelo.Imovel;
import modelo.TipoImovel;
import services.ImovelService;
import services.SimpleEntityManager;

public class TesteImovel {

	public void teste() {
		// TODO Auto-generated method stub
		String persistenceUnitName = "Testes";
        
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);
         
        ImovelService imovelService = new ImovelService(simpleEntityManager);
        
        Cliente cliente = new Cliente(1, 
			      "Junior do Pneu", 
			      "12345678901", 
			      "98 ", 
			      "", 
			      "junin@email", 
			      "10-10-1999");
        
        TipoImovel tipoImovel = new TipoImovel(2, "Armazem");

        Imovel imovel = new Imovel(1, 
        						   "Rua A, casa 10, em frente ao comercio do Zé da Farinha", 
        						   2, 
        						   1, 
        						   0, 
        						   200, 
        						   450.0, 
        						   cliente, 
        						   tipoImovel);
        
        //listar antes
        for(Imovel i : imovelService.findAll()){
            System.out.println(i.getEndereco());
        }
         
        imovelService.save(imovel);
         
        //listar apos insert
        for(Imovel i : imovelService.findAll()){
            System.out.println(i.getEndereco());
        }
         
        imovel.setEndereco("Rua A, casa 10, em frente ao comercio do Zeca da Farinha");
        
        imovelService.update(imovel);
        
        //listar apos update
        for(Imovel i : imovelService.findAll()){
            System.out.println(i.getEndereco());
        }
        
        imovelService.remove(imovel);
        
        //listar apos remove
        for(Imovel i : imovelService.findAll()){
            System.out.println(i.getEndereco());
        }
       
        simpleEntityManager.close();
	}

}
