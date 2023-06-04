package w5CodingAssignment;

public class App {

	public static void main(String[] args) {
		// Utilizing interfaces
		
		Logger logger = new AsteriskLogger();
		
		logger.Log("Earth Earth");
		logger.Error("Yep Yep Yep Yep Yep Yep Yep");
		
		Logger loggest = new SpacedLogger();
		loggest.Log("Radio rrrraaadddiiioooo");
		loggest.Error("what what what what what what what");
	}

}