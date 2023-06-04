package w5CodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String one) {
		String oneSum = "";
		for(int i = 0; i < one.length(); i++) {
			oneSum += one.charAt(i) + " ";
		}
		System.out.println(oneSum);
		
	}

	@Override
	public void Error(String two) {
		String twoSum = "";
		for(int i = 0; i < two.length(); i++) {
			twoSum += " " + two.charAt(i);
		}
		System.out.println("ERROR:" + twoSum);		
		
	}

}