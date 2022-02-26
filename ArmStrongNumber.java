package week1.day2;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int calculated = 0, remainder = 0, original = 153;
		int input = original;
		
		while (input != 0) {
			remainder = input % 10;
			calculated = calculated + (remainder * remainder * remainder);
			input = input / 10;
		}
		
		if(original == calculated) {
			System.out.println("The Given number " + original + " is an ArmStrong Number");
		}
		else {
			System.out.println("The Given number " + original + " is not an ArmStrong Number");
		}
	}

}
