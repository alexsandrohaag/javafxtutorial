import javafx.application.Application;
import javafx.stage.Stage;

public class Exemplo1 extends Application {

	public static void main (String[] args) {
		launch(args);
	}

	@Override
	public void start (Stage estagio) {
		estagio.setTitle("Olá Mundo!");
		estagio.show();
	}
}
