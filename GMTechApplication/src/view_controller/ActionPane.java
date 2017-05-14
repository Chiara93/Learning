package view_controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Presenter;
import model.Presenters;
import view_controller.AddPresenterPanel;
import view_controller.TableViewList;

/*
 * Class ActionPane
 * ActionPane is a VBox containing some panels
 * to divide different actions of the user using the application.
 * These panels are arranged vertically inside the VBox element
 * */
public class ActionPane extends VBox{
	
	/* Graphical components of User Interface */
	private AddPresenterPanel addictionPanel;
	private TextArea textPanel = new TextArea();
	private HBox buttonPanel = new HBox();	
	private Button selectButton = new Button();
	private Button removeButton = new Button();
	
	/* Alert variables to show on the screen a message */
	private Alert infoAlert;
	private Alert errorAlert;
	
	/* Constructor */
	public ActionPane(Presenters presenters, TableViewList<Presenter> table) {
		
		/* Instantiation of panel to add presenter */
		this.addictionPanel = new AddPresenterPanel(presenters);
		
		/* Set properties of VBox */
		this.setPadding(new Insets(0.0, 0.0, 5.0, 5.0));
		this.setSpacing(5.0);
		/* Populate VBox */
		this.getChildren().addAll(addictionPanel, textPanel, buttonPanel);
		
		/* Set properties, text, alignment spacing, of VBox graphical components */
		this.textPanel.setMaxHeight(100.0);
		this.textPanel.setEditable(false);	
		this.selectButton.setText("Select presenter");
		this.removeButton.setText("Remove presenter");
		this.buttonPanel.setSpacing(5.0);
		this.buttonPanel.setAlignment(Pos.BOTTOM_RIGHT);
		this.buttonPanel.getChildren().addAll(selectButton, removeButton);
		
		if(presenters.isPresentersEmpty()) {
			this.selectButton.setDisable(true);
			this.removeButton.setDisable(true);
		}
		
		/* Create Alert objects e set all its properties */
		this.infoAlert = new Alert(AlertType.INFORMATION);
		this.infoAlert.setTitle("Finish!");
		this.infoAlert.setHeaderText("Message");
		this.infoAlert.setContentText("All presenters have talked. Presentation is finished!");		
		this.errorAlert = new Alert(AlertType.ERROR);
		this.errorAlert.setTitle("Error!");
		this.errorAlert.setHeaderText("Error");
		this.errorAlert.setContentText("Select a presenter if you want to remove anyone");
	    
		/* Set a listener on button to select a presenter */
		this.selectButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				table.getSelectionModel().clearSelection();
				Presenter presenter = presenters.selectPresenter();
				if(presenter != null) {
					textPanel.setText("Next presenter is: \n" + presenter.toString());				
				} else {			   
					infoAlert.showAndWait();
					textPanel.clear();
				}
			}
		});
		
		/* Set a listener on button to remove a presenter */
		this.removeButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Presenter selectedItem = (Presenter) table.getSelectionModel().getSelectedItem();
				if(selectedItem == null) {
				    errorAlert.showAndWait();
					return;
				}
				
				if (presenters.removePresenter(selectedItem)) {
					textPanel.clear();
					table.getItems().remove(selectedItem);
				} else {
					textPanel.setText(selectedItem.getName() + " " + selectedItem.getSurname() + " has already talked. You can't remove!");
				}
				
				if(presenters.isPresentersEmpty()){	
					removeButton.setDisable(true);
					selectButton.setDisable(true);
				}				
				table.getSelectionModel().clearSelection();
			}
		});
		
		
	}
}
