package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import teste.TesteAluguel;
import teste.TesteCliente;
import teste.TesteImovel;
import teste.TesteLocacao;
import util.InicioUtil;

public class ControllerInicio implements Initializable{
	
	@FXML
	MenuItem mn_cliente_new, mn_cliente_buscar, mn_cliente_atualizar, mn_cliente_tst;
	
	@FXML
	MenuItem mn_imovel_new, mn_imovel_atualizar, mn_imv_cep, mn_imv_valor, mn_imv_tipo, mn_imv_proprietario, mn_imovel_tst;
	
	@FXML
	MenuItem mn_loc_new, mn_loc_atualizar, mn_loc_ativa, mn_loc_cliente, mn_loc_tst;
	
	@FXML
	MenuItem mn_aluguel_novo, mn_aluguel_atualizar, mn_aluguel_listar, mn_aluguel_tst;
	
	@FXML
	MenuItem mn_help_sobre;
	
	@FXML
	AnchorPane ap_base;
	
	private InicioUtil inicioService;
	
	public ControllerInicio() throws Exception {
		// TODO Auto-generated constructor stub
		this.inicioService = InicioUtil.getInstancia();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		mn_cliente_new.setDisable(true); 
		mn_cliente_buscar.setDisable(true);  
		mn_cliente_atualizar.setDisable(true); 
		
		mn_imovel_new.setDisable(true);  
		mn_imovel_atualizar.setDisable(true);  
		mn_imv_cep.setDisable(true);  
		mn_imv_valor.setDisable(true);  
		mn_imv_tipo.setDisable(true);  
		mn_imv_proprietario.setDisable(true); 
		
		mn_loc_new.setDisable(true); 
		mn_loc_atualizar.setDisable(true); 
		mn_loc_ativa.setDisable(true); 
		mn_loc_cliente.setDisable(true);
		
		mn_aluguel_novo.setDisable(true); 
		mn_aluguel_atualizar.setDisable(true); 
		mn_aluguel_listar.setDisable(true);
		
		mn_cliente_tst.setOnAction(e -> {
			TesteCliente tc = new TesteCliente();
			tc.teste();
		});
		
		mn_imovel_tst.setOnAction(e -> {
			TesteImovel ti = new TesteImovel();
			ti.teste();
		});
		
		mn_loc_tst.setOnAction(e -> {
			TesteLocacao tl = new TesteLocacao();
			tl.teste();
		});
		
		mn_aluguel_tst.setOnAction(e -> {
			TesteAluguel ta = new TesteAluguel();
			ta.teste();
		});
	}

}
