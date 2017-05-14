package view_controller;

import java.util.Date;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import model.Presenter;
import model.Presenters;

/*
 * Class AddPresenterPanel
 * AddPresenterPanel is a GridPane containing graphical elements
 * to add a new complete presenter with name and surname
 * */
public class AddPresenterPanel extends GridPane{
	
	/* Constraints on two columns of GridPane */
	private ColumnConstraints firstCol = new ColumnConstraints();
	private ColumnConstraints secondCol = new ColumnConstraints();
	
	/* Graphical components of User Interface */
	private Label nameLabel = new Label();
	private Label surnameLabel = new Label();
	private TextField nameTextField = new TextField();
	private TextField surnameTextField = new TextField();
	private HBox hbBtn = new HBox();
	private Button addPresenterButton = new Button();
	
	/* Variables to blink graphical components */
	private Timeline blinkerName;
	private Timeline blinkerSurname;
	private SequentialTransition blinkName;
	private SequentialTransition blinkSurname;
	
	/* Constructor */
	public AddPresenterPanel(Presenters presenters) {
		
		/* Set constraints on columns width */
		this.firstCol.setPercentWidth(15.0);
		this.secondCol.setPercentWidth(85.0);
		this.getColumnConstraints().addAll(firstCol, secondCol);
		
		/* Set properties, text and alignment, of GridPane graphical components */
		this.nameLabel.setText("Name:");
		this.surnameLabel.setText("Surname:");
		this.nameTextField.setPromptText("Name");
		this.surnameTextField.setPromptText("Surname");
		this.addPresenterButton.setText("Add presenter");
		this.hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		this.hbBtn.getChildren().add(addPresenterButton);
		
		/* Populate GridPane */
		this.add(nameLabel, 0, 0);
		this.add(nameTextField, 1, 0);
		this.add(surnameLabel, 0, 1);
		this.add(surnameTextField, 1, 1);
		this.add(hbBtn, 1, 2);
		
		/* Creation of blinker and transition for animation */
		this.blinkerName = createBlinker(nameTextField);
		this.blinkerSurname = createBlinker(surnameTextField);
		this.blinkName = new SequentialTransition(nameTextField, blinkerName);
		this.blinkSurname = new SequentialTransition(surnameTextField, blinkerSurname);
		
		/* Set a listener on button to add a presenter */
		this.addPresenterButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {	
				if(!nameTextField.getText().isEmpty() && !surnameTextField.getText().isEmpty()) {	/* Complete presenter */
					presenters.addPresenter(new Presenter(nameTextField.getText(), surnameTextField.getText(), new Date()));
					nameTextField.clear();
					surnameTextField.clear();
					HBox buttonPanel = (HBox) getParent().getChildrenUnmodifiable().get(2);
					Button selectButton = (Button) buttonPanel.getChildren().get(0);
					Button removeButton = (Button) buttonPanel.getChildren().get(1);
					selectButton.setDisable(false);
					removeButton.setDisable(false);
				} else {	/* Incomplete presenter */
					if(nameTextField.getText().isEmpty() && surnameTextField.getText().isEmpty()) {
						blinkName.play();
						blinkSurname.play();
					} else if(nameTextField.getText().isEmpty()) {					
						blinkName.play();
					} else {					
						blinkSurname.play();
					}
				}
			}
		});
		
		/* Set GridPane properties */
		this.setVgap(5.0);
		this.setPadding(new Insets(5.0));
		this.setBorder(new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	/* Create a blinker to notify user that presenter is not complete of name and surname */
	private Timeline createBlinker(Node node) {
		Timeline blink = new Timeline(new KeyFrame(Duration.seconds(0), new KeyValue(node.opacityProperty(), 1, Interpolator.DISCRETE)),
										new KeyFrame(Duration.seconds(0.5), new KeyValue(node.opacityProperty(), 0, Interpolator.DISCRETE)),
										new KeyFrame(Duration.seconds(1), new KeyValue(node.opacityProperty(), 1, Interpolator.DISCRETE)));
		blink.setCycleCount(2);
		return blink;
	}
}
