package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import util.InicioUtil;

public class ControllerInicio implements Initializable{
	
	@FXML
	MenuItem mn_cliente_new, mn_cliente_buscar, mn_cliente_atualizar;
	
	@FXML
	MenuItem mn_imovel_new, mn_imovel_atualizar, mn_imv_cep, mn_imv_valor, mn_imv_tipo, mn_imv_proprietario;
	
	@FXML
	MenuItem mn_loc_new, mn_loc_atualizar, mn_loc_ativa, mn_loc_cliente;
	
	@FXML
	MenuItem mn_aluguel_novo, mn_aluguel_atualizar, mn_aluguel_listar;
	
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
		
	}

}
