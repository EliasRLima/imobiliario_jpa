package teste;

import modelo.Aluguel;
import services.AluguelService;
import services.SimpleEntityManager;

public class TesteAluguel {

	public void teste() {
		// TODO Auto-generated method stub
		String persistenceUnitName = "Testes";
        
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);
         
        AluguelService aluguelService = new AluguelService(simpleEntityManager);
        
        Aluguel aluguel = new Aluguel(1, 
        							  1, 
        							  "09-09-2021", 
        							  250.0, 
        							  "CASA 25 - Uso de um final de semana.");
        
        //listar antes
        for(Aluguel a : aluguelService.findAll()){
            System.out.println(a.getText());
        }
         
        aluguelService.save(aluguel);
         
        //listar apos insert
        for(Aluguel a : aluguelService.findAll()){
            System.out.println(a.getText());
        }
         
        aluguel.setText("CASA 25 - Uso de dois finais de semana.");
        aluguel.setDtVencimento("16-09-2021");
        
        aluguelService.update(aluguel);
        
        //listar apos update
        for(Aluguel a : aluguelService.findAll()){
            System.out.println(a.getText());
        }
        
        aluguelService.remove(aluguel);
        
        //listar apos remove
        for(Aluguel a : aluguelService.findAll()){
            System.out.println(a.getText());
        }
       
        simpleEntityManager.close();
        
	}

}
