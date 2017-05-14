package view_controller;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Presenter;

/*
 * Class TableViewList
 * TableViewList is a component of graphical user interface.
 * It shows the list of presenters, including name and surname.
 * */
public class TableViewList<Presenter> extends TableView{
	
	/* Columns of TableView*/
	private TableColumn firstNameCol = new TableColumn();
	private TableColumn secondSurnameCol = new TableColumn();
	
	/* Constructor */
	public TableViewList(ObservableList<Presenter> presenters) {
		
		/* Set column name */
		this.firstNameCol.setText("Name");
		this.secondSurnameCol.setText("Surname");
		
		/* Set value of column table, linked to instance variables of class Presenter */
		this.firstNameCol.setCellValueFactory(new PropertyValueFactory<Presenter, String>("name"));
		this.secondSurnameCol.setCellValueFactory(new PropertyValueFactory<Presenter, String>("surname"));		
		
		/* Set width of column table */
		this.firstNameCol.prefWidthProperty().bind(this.widthProperty().multiply(0.5));
		this.secondSurnameCol.prefWidthProperty().bind(this.widthProperty().multiply(0.5));		
		this.firstNameCol.setResizable(false);
		this.secondSurnameCol.setResizable(false);
		
        this.getColumns().addAll(firstNameCol, secondSurnameCol);
     
        /* Populate TableView with data*/
        this.setItems(presenters);
	}
}
