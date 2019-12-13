
package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
/**
 * Clase ejecutable de la aplicación que muestra un login con un botón que al ser pulsado abre nueva ventana
 * @author Carlos Pardos
 * @version 1.0
 * @see ControlRocket
 * @since 1.0
 */

public class MainRocket extends Application {
	/**
	 * Metodo con el cargador que arranca la ejecución de la aplicacion
	 */
	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Mars.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Primera vista");
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
