import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import services.InicioService;

public class Inicio extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		InicioService.iniciarClasse(stage);
		InicioService is = InicioService.getInstancia();
		is.inicial();
	}

	@Override
	public void stop() throws Exception {
		super.stop();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
