/* Taylor Nguyen
 * APCS period 1
 * Pair programming assignment (programmer 2: Julio Dela Cruz)
 */
import java.util.Scanner;
public class ProcessingNumbers {

	private static Scanner nums;

	public static void main(String[] args) {
		System.out.println("enter 4 numbers to find the largest and smallest integer from");
		nums = new Scanner(System.in);
		System.out.println("enter first integer");
		int num1 = nums.nextInt();
		System.out.println("enter second integer");
		int num2 = nums.nextInt();
		System.out.println("enter third integer");
		int num3 = nums.nextInt();
		System.out.println("enter last integer");
		int num4 = nums.nextInt();
// these if loops return the largest
		if(num1 >= num2) {
			
			if(num1 >= num3) {
				
				if(num1 >= num4) {
					
					System.out.println("Largest integer: " + num1);
					
				} else {
					
					System.out.println("Largest integer: " + num4);
				}
			} else if (num3 >= num4) {
				
				System.out.println("Largest integer: " + num3);
				
			} else {
				
				System.out.println("Largest integer: " + num4);
			} 
			
		} else if( num2 >= num3) {
				
				if(num2 >= num4) {
					

					System.out.println("Largest integer: " + num2);
					
				}else { System.out.println("Largest integer: " + num4);
				}
			} else { System.out.println("Largest integer: " + num3);
			
			}
//these if loops return the smallest
		if(num1 <= num2) {
			
			if(num1 <= num3) {
				
				if(num1 <= num4) {
					
					System.out.println("Smallest integer: " + num1);
					
				} else {
					
					System.out.println("Smallest integer: " + num4);
				}
			} else if (num3 <= num4) {
				
				System.out.println("Smallest integer: " + num3);
				
			} else {
				
				System.out.println("Smallest integer: " + num4);
			} 
			
		} else if( num2 <= num3) {
				
				if(num2 <= num4) {
					

					System.out.println("Smallest integer: " + num2);
					
				}else { System.out.println("Smallest integer: " + num4);
				}
			} else { System.out.println("Smallest  integer: " + num3);

	}
	
	}
}
				

