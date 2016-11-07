package fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class Controller {

	Die dice = new Die();
	Die8 dice8 = new Die8();
	Die12 dice12 = new Die12();
	Die20 dice20 = new Die20();

	@FXML
	private ImageView pic;

	@FXML
	private Button roll6;

	@FXML
	private Label die1;

	@FXML
	private Label die2;

	@FXML
	private Button roll8;

	@FXML
	private Button roll20;

	@FXML
	private Button roll12;

	@FXML
	void rollButton(ActionEvent event) {
		dice.roll();
		die1.setText(" You rolled a " + Integer.toString(dice.getDie1()) + "!");
		die2.setText("You rolled a " + Integer.toString(dice.getDie2()) + "!");

	}

	@FXML
	void rollButton12(ActionEvent event) {
		dice12.roll12();
		die1.setText(" You rolled a " + Integer.toString(dice12.getDieTwelve1()) + "!");
		die2.setText("You rolled a " + Integer.toString(dice12.getDieTwelve2()) + "!");

	}

	@FXML
	void rollButton20(ActionEvent event) {
		dice20.roll20();
		die1.setText(" You rolled a " + Integer.toString(dice20.getDieTwenty1()) + "!");
		die2.setText("You rolled a " + Integer.toString(dice20.getDieTwenty2()) + "!");

	}

	@FXML
	void rollButton8(ActionEvent event) {
		dice8.roll8();
		die1.setText(" You rolled a " + Integer.toString(dice8.getDieEight1()) + "!");
		die2.setText("You rolled a " + Integer.toString(dice8.getDieEight2()) + "!");

	}

}
