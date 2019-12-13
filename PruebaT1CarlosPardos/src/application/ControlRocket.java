package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
/**
 * Clase controladora con los m�todos para poner en funcionamiento la transici�n, apertura y cierre de ventana
 */	
public class ControlRocket {	
	
	
	@FXML
	private ImageView imagenLogin;
	
	/**
	 * M�todo que inicializa la transici�n al cargar la p�gina
	 */
	public void initialize() {
		transicionImagen();
	}	
	
	/**
	 * M�todo que carga la nueva ventana cuando se clicka el bot�n
	 */
	@FXML	
	public void openStage() {		
		
		try {			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Urano.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 500);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Segunda Vista");
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * M�todo que lleva a cabo la transicion de la imagen del login
	 */
	
	private void transicionImagen() {
		FadeTransition transicion = new FadeTransition(Duration.seconds(5), imagenLogin);
		transicion.setFromValue(0);
		transicion.setToValue(1);
		transicion.play();
	}
	
	/**
	 * M�todo encargado del cierre de la aplicaci�n 
	 */
	@FXML
	public void closeApp() {
		System.exit(0);
	}


}
