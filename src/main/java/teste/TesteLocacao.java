package teste;


import modelo.Cliente;
import modelo.Imovel;
import modelo.Locacao;
import modelo.TipoImovel;
import services.LocacaoService;
import services.SimpleEntityManager;

public class TesteLocacao {
	
	public void teste() {
		String persistenceUnitName = "Testes";
		
		SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);
	    
	    LocacaoService locacaoService = new LocacaoService(simpleEntityManager);
	    
	    Cliente cliente = new Cliente(1, 
			      "Junior do Pneu", 
			      "12345678901", 
			      "98 ", 
			      "", 
			      "junin@email", 
			      "10-10-1999");
	    
	    Cliente proprietario = new Cliente(2, 
				   "Thais", 
				   "12312312312", 
				   "98 3452-3542", 
				   "", 
				   "thais@email", 
				   "24-10-1887");
	    
	    TipoImovel tipoImovel = new TipoImovel(2, "Armazem");

        Imovel imovel = new Imovel(1, 
        						   "Rua B, casa 12", 
        						   2, 
        						   1, 
        						   0, 
        						   200, 
        						   350.0, 
        						   proprietario, 
        						   tipoImovel);
	    
	    Locacao locacao = new Locacao(1, 
	    			                  1, 
	    			                  "09-09-2021", 
	    			                  "16-09-2021", 
	    			                  16, 
	    			                  300.0, 
	    			                  "Contrato feito via chamada.", 
	    			                  imovel, 
	    			                  cliente);
	    
	    //listar antes
        for(Locacao l : locacaoService.findAll()){
            System.out.println(l.getObs());
        }
         
        locacaoService.save(locacao);
         
        //listar apos insert
        for(Locacao l : locacaoService.findAll()){
            System.out.println(l.getObs());
        }
         
        locacao.setObs("Contrato feito via chamada pelo numero 98 99999-1111.");
        
        locacaoService.update(locacao);
        
        //listar apos update
        for(Locacao l : locacaoService.findAll()){
            System.out.println(l.getObs());
        }
        
        locacaoService.remove(locacao);
        
        //listar apos remove
        for(Locacao l : locacaoService.findAll()){
            System.out.println(l.getObs());
        }
       
        simpleEntityManager.close();
	}
}
