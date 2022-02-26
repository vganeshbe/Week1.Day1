package week1.day2;

//import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range = 8, firstNum = 0, secNum = 1;
		int sum = 0;
		
		System.out.println("1) " + firstNum);
		if (range > 1) {
			System.out.println("2) " + secNum);
			if (range > 2) {
				for (int i = 2; i < range; i++) {
					sum = firstNum + secNum;
					firstNum = secNum;
					secNum = sum;
					System.out.println(i+1 + ") " + sum);

			}
		}
		
		}
	}

}
