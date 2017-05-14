package model;

import java.util.Date;

/*
 * Class Presenter
 * Presenter is a member of the meeting in a company.
 * He has to speak during the meeting at a selected date 
 * */
public class Presenter {
	
	/* Instance variables */
	private String name;
	private String surname;
	private Date presentationDate = null;
	private boolean hasTalked = false;
	
	/* Constructor */
	public Presenter() {
	}
	
	/* Constructor with instance variables */
	public Presenter(final String name, final String surname, final Date presentationDate) {
		this.name = name;
		this.surname = surname;
		this.presentationDate = presentationDate;
	}
	
	/* Getters and setters */
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getPresentationDate() {
		return this.presentationDate;
	}

	public void setPresentationDate(Date presentationDate) {
		this.presentationDate = presentationDate;
	}
	
	public boolean isHasTalked() {
		return this.hasTalked;
	}

	public void setHasTalked(boolean hasTalked) {
		this.hasTalked = hasTalked;
	}	
	
	public String toString() {
		return this.name + " " + this.surname;
	}
}
