package replaceArrayWithObject;

public class ReplaceArrayWithObject {
	
	public static void main(String[] args) {
		Performance row = new Performance();
		row.setName("Liverpool");
		row.setWins("15");
		row.setLosses("10");
		
		System.out.println("Name: " + row.getName());
		System.out.println("Wins: " + row.getWins());
		System.out.println("Losses: " + row.getLosses());
	}
}
