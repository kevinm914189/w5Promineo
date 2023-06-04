package w5CodingAssignment;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String one) {
				System.out.println("***" + one + "***");
		
	}

	@Override
	public void Error(String two) {
		int i = two.length();
		String stars = "";
		for(int s = 0; s < i; s++) {
		stars += "*";
		}
			System.out.println("*************" + stars);
			System.out.println("***" + "ERROR: " + two + "***");
			System.out.println("*************" + stars);			
		
	}

}
