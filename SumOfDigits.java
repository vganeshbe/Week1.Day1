package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {

		int  input = 123, number = 0, sum = 0, remainder = 0;
		number = input;
		
		while (number > 0) {
			
			remainder = number % 10;
			sum = sum + remainder;
			
//			System.out.println(remainder);
			
			number = number / 10;
		}
		
		System.out.println("Sum of Digits of " + input +" is " + sum);
		
	}

}
