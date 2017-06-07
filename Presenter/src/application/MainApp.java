package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainApp {

	public static void main(String[] args) {

		String presentersPathFile = "./presenters.txt";
		String excludedPathFile = "./excluded.txt";

		List<String> presenters = toList(presentersPathFile);
		List<String> excluded = toList(excludedPathFile);
		
		presenters.removeAll(excluded);
		
		Random r = new Random();
		int index = r.nextInt(presenters.size());
		
		System.out.println("Next presenter is: " + presenters.get(index));		
	}

	private static List<String> toList(String presentersPathFile) {
		List<String> result = new ArrayList<>();		
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(presentersPathFile);
			br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				result.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

}
