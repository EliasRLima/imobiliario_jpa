package util;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Service para facilitar a comunicação do stage principal 
 * com outros controllers e encapsular a logica de resize do stage (maximizar, minimizar...)
 */

public final class InicioUtil {

  private static InicioUtil instancia; // singleton | instanca unica
  private Stage janela; // janela principal

  private InicioUtil(Stage janela) {
    this.janela = janela;
  }

  /**
   * Inicia a classe com o stage principal
   * 
   * @param janela - principal stage da aplicação
   * @return - instancia criada da classe
   */
  public static InicioUtil iniciarClasse(Stage janela) {
    instancia = new InicioUtil(janela);
    return instancia;
  }

  /**
   * 
   * @return - a instancia unica da classe
   * @throws Exception
   */
  public static InicioUtil getInstancia() throws Exception {
    if (instancia == null)
      throw new Exception("Instancia da classe InicialService não foi criada!");
    return instancia;
  }

  /**
   * Minimiza o stage principal
   */
  public void minimizar() {
    this.janela.setIconified(true);
  }
  
  public void inicial() throws IOException {
	    Parent root = FXMLLoader.load(CarregadorRecursos.getResource(Templates.BASE.getUrl()));
		Scene scene = new Scene(root, 1024, 768); // resolucao inicial
		this.janela.setScene(scene);
		this.janela.setTitle("Sistema Imobiliario");
		this.janela.setMinHeight(768);
		this.janela.setMinWidth(1024);
		this.janela.show();
  }

  

}
