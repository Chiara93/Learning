package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/*
 * Class Presenters
 * This class manages the list of all presenters during the meeting
 * by selecting, removing or adding one
 * */
public class Presenters {
	
	/* List of presenters */
	private ObservableList<Presenter> presenters = FXCollections.observableArrayList();
	private List<Presenter> excludedPresenters = new ArrayList<Presenter>();
	
	/* Counter to manage how many presenters have yet to talk */
	private int countPresentersToTalk = 0;
	
	/* Adds new member to list of presenters and updates the counter */
	public void addPresenter(Presenter presenter) {
		this.presenters.add(presenter);
		this.countPresentersToTalk++;
	}
	
	/* Removes presenter from people of the meeting 
	 * by updating the counter if the selected presenter has not talked.
	 * In this case the presenter becomes a member of another list containing 
	 * people who has not talked(absent)*/
	public boolean removePresenter(Presenter presenter) {
		if(!presenter.isHasTalked()) {
			this.countPresentersToTalk--;
			this.excludedPresenters.add(presenter);
			return true;
		}
		return false;
	}

	/* Getter and setter of presenters list */
	public ObservableList<Presenter> getPresenters() {
		return this.presenters;
	}
	
	/* Getter and setter of excluded presenters list */
	public List<Presenter> getExcludedPresenters() {
		return this.excludedPresenters;
	}
	
	/* Gets size of presenters list */
	public int getSizePresenters() {
		return this.presenters.size();
	}
	
	/* Selects randomly a presenter to talk from the list
	 * If the presenter has already talked and there are other people
	 * who have to speak a new member is selected */
	public Presenter selectPresenter() {
		Presenter presenter;	
		do {
			Random r = new Random();
			int index = r.nextInt(this.presenters.size());
			presenter = this.presenters.get(index);
		} while (presenter.isHasTalked() != false && this.countPresentersToTalk != 0);

		if(this.countPresentersToTalk != 0) {
			presenter.setHasTalked(true);
			this.countPresentersToTalk--; 
			return presenter;
		} else {
			return null;
		}
	}
	
	/* Returns if the presenters list is empty */
	public boolean isPresentersEmpty() {
		return this.presenters.isEmpty();
	}
	
	/* Returns if there are excluded presenters or not */
	public boolean isExcludedListExmpty() {
		return this.excludedPresenters.isEmpty();
	}
}
