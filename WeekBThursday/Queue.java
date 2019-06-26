import java.util.ArrayList;

public class Queue {
	public static void main(String[] args) {
		ArrayList<String> usernames = new ArrayList<String>();
	
		System.out.println("Adding usernames to Queue");
		String newUsername = "reinwaser";
	
		addToQueue(usernames, newUsername); // adds a new element to the Queue
		addToQueue(usernames, "mordwen");
		addToQueue(usernames, "Zandius");
		addToQueue(usernames, "Shyrogue");
		System.out.println("Contents after adding are: " + usernames.toString());
	
		//remove head of Queue
		removeFromQueue(usernames);
	
		System.out.println("------------------------------------------------------" + "\n" +
				"printing the Queue after removing: " + usernames.toString());
		
		//polls the head of the Queue
		System.out.println("------------------------------------------------------" + "\n" +
				pollQueue(usernames) + "\n");
		
	}

	
	

	//method that acts like a Queue methods
	public static void addToQueue(ArrayList<String> usernames, String username) {
		usernames.add(username);
	}
	
	public static void removeFromQueue(ArrayList<String> usernames) {
		usernames.remove(0);
	}
	
	public static String pollQueue(ArrayList<String> usernames) {
		String username = usernames.get(0);
		usernames.remove(0);
		return username;
	}
}
