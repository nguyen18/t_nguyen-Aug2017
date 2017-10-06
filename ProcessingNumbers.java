/* Taylor Nguyen
 * APCS period 1
 * Pair programming assignment (programmer 2: Julio Dela Cruz)
 */
import java.util.Scanner;
public class ProcessingNumbers {

	private static Scanner scans;

	public static void main(String[] args) {
		scans = new Scanner(System.in);
		int input = 0;
		int sumEven = 0;
		int maxEven = 0;
		boolean done = false;
		String repeat;
		
		System.out.println("This program finds the max integer, smallest integer, sum of the even numbers and the max even number from numbers inputed");
		System.out.println("Input first integer:");
		input = scans.nextInt();
		int max = input;
		int min = input;
			if(input % 2 == 0) {
				maxEven = input;
				sumEven = input;
			}
			System.out.println("Done? yes or no");
			repeat = scans.next();
					while(!repeat.equals("yes") && !repeat.equals("no")){ 
						System.out.println("error. please type yes or no");
						repeat = scans.next();
					} 
		if(repeat.equals("no")) {
		do {
			System.out.println("Input next integer:");
			input = scans.nextInt();
			if(max <= input) {
				max = input;
			} 
			
			if(max >= input && min >= input) {
				min = input;
			}
			if(input % 2 == 0) {
				if(maxEven <= input) {
					maxEven = input;
				}
				sumEven += input;
			}
			System.out.println("Done? yes or no");
			repeat = scans.next();
					while(!repeat.equals("yes") && !repeat.equals("no")){ 
						System.out.println("error. please type yes or no");
						repeat = scans.next();
					} 
				
				if(repeat.equals("no")) {
					done = false;
				} else if(repeat.equals("yes")) {
					done = true;
				}
		} while (!done);
		}
			System.out.println("Largest Integer: " + max);
			System.out.println("Smallest Integer: " + min);
			System.out.println("Largest even integer: " + maxEven);
			System.out.println("Sum of even numbers: " + sumEven);
			
		}
	
	}
	

				

