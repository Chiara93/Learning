package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import model.Presenter;

/*
 * Class ToFileWriter
 * This class is a writer of text file
 * It writes all information of excluded presenters
 * */
public class ToFileWriter {
	/* File name */
	private static final String FILENAME = "excluded_presenters.txt";
	
	/* Writers to work with file */
	private BufferedWriter bWriter;
	private FileWriter fWriter;
	
	/* Constructor */
	public ToFileWriter() throws IOException {
		this.fWriter = new FileWriter(FILENAME, true);
		this.bWriter = new BufferedWriter(fWriter);
	}
	
	/* Writes on text file. 
	 * If the file doesn't exist, creates it. 
	 * Otherwise writer appends new information to file content */
	public void writeToFile(List<Presenter> excludedPresenters) throws IOException, ParseException {
		bWriter.write("Excluded presenters from talk:");
		bWriter.newLine();
		for (Presenter presenter : excludedPresenters) {
			bWriter.write(new SimpleDateFormat("MM/dd/yyyy").format(presenter.getPresentationDate().getTime()) + " - ");
			bWriter.write(presenter.toString());
			bWriter.newLine();
		}
		bWriter.write("-----------------------------------------------------------------");
		bWriter.newLine();
		
		/* Close resource */
		bWriter.close();
		fWriter.close();
	}

}
