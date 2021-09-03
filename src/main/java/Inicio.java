import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import util.InicioUtil;

public class Inicio extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		InicioUtil.iniciarClasse(stage);
		InicioUtil is = InicioUtil.getInstancia();
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
