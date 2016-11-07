package fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("Roll.fxml"));
		
		Scene scene = new Scene(parent);
		
		
		arg0.setScene(scene);
		arg0.setTitle("Dice Roller");
		
		arg0.show();

	}



}
