package application;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import model.Presenter;
import model.Presenters;
import utils.ToFileWriter;
import view_controller.ActionPane;
import view_controller.TableViewList;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/*
 * Entry point of JavaFX application 
 * This application manages presenters during a meeting
 * */
public class Main extends Application {
	
	/* This object manages all presenters of the meeting */
	private Presenters presenters = new Presenters();

	@Override
	public void start(Stage primaryStage) {
		/* Populate list of all presenter */
		presenters.addPresenter(new Presenter("Chiara", "Ferrario", new Date()));
		presenters.addPresenter(new Presenter("Stefano", "Coluccia", new Date()));
		presenters.addPresenter(new Presenter("Valentino", "Decarli", new Date()));
		presenters.addPresenter(new Presenter("Gennaro", "", new Date()));
		presenters.addPresenter(new Presenter("Dario", "Zivko", new Date()));
		presenters.addPresenter(new Presenter("Alessandro", "Misenta", new Date()));
		presenters.addPresenter(new Presenter("Mattia", "Cattaneo", new Date()));
		presenters.addPresenter(new Presenter("Enrico", "Mazzi Bernasconi", new Date()));
		presenters.addPresenter(new Presenter("Manlio", "Modugno", new Date()));
		presenters.addPresenter(new Presenter("Enrico", "Mangano", new Date()));
		presenters.addPresenter(new Presenter("Tommaso", "Torti", new Date()));
		presenters.addPresenter(new Presenter("Giovanni", "Mele", new Date()));
		presenters.addPresenter(new Presenter("Matteo", "Besutti", new Date()));
		presenters.addPresenter(new Presenter("Manlio", "Vaccalluzzo", new Date()));
		presenters.addPresenter(new Presenter("Massimiliano", "Pepe", new Date()));
		presenters.addPresenter(new Presenter("Pino", "", new Date()));
		presenters.addPresenter(new Presenter("Franco", "Sellitto", new Date()));

		try {
			/* Graphical components of main BorderPane */
			TableViewList<Presenter> table = new TableViewList<>(presenters.getPresenters());		
			ActionPane rightPane = new ActionPane(presenters, table);
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,850, 400);
			
			/* Set graphical property of BorderPane */
			root.setPadding(new Insets(5.0));
			/* Populate BorderPane */
			root.setCenter(table);
			root.setRight(rightPane);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void stop(){
	    try {
	    	if(!presenters.isExcludedListExmpty()) {
		    	/* Create object to write on file */
				ToFileWriter writer = new ToFileWriter();
				/* Write on file */
				writer.writeToFile(presenters.getExcludedPresenters());
	    	}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
