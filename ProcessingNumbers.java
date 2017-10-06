/* Taylor Nguyen
 * APCS period 1
 * Pair programming assignment (programmer 2: Julio Dela Cruz)
 */
import java.util.Scanner;
public class ProcessingNumbers {

	private static Scanner nums;

	public static void main(String[] args) {
		System.out.println("enter 4 numbers. This programs finds the largest and smallest integer from numbers inputed");
		nums = new Scanner(System.in);
		System.out.println("enter first integer");
		int num1 = nums.nextInt();                    
		System.out.println("enter second integer");
		int num2 = nums.nextInt();
		System.out.println("enter third integer");
		int num3 = nums.nextInt();
		System.out.println("enter last integer");
		int num4 = nums.nextInt();
		
// these if loops return the largest integer
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
			} else if (num3 >= num4) { 
				System.out.println("Largest integer:"  + num3);
				
			} else {
				System.out.println("Largest integer: " + num4);
			}
//these if loops return the smallest integer
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
		} else if (num3 <= num4) { 
			System.out.println("Smallest integer:"  + num3);
			
		} else {
			System.out.println("Smallest integer: " + num4);
		}
// finds all the even numbers
		System.out.print("Even numbers: " );
		boolean num1Even = false;
		boolean num2Even = false;
		boolean num3Even = false;
		boolean num4Even = false;
		if(num1 % 2 == 0) {
			num1Even = true;
			System.out.print(num1 + ", ");
		}
		if(num2 % 2 == 0) {
			num2Even = true;
			System.out.print(num2 + ", ");
		}
		if(num3 % 2 == 0) {
			num3Even = true;
			System.out.print(num3 + ", ");
		}
		if(num4 % 2 == 0) {
			num4Even = true;
			System.out.print(num4 + ", ");
		}
		System.out.println();
// prints largest even number
		System.out.print("If all 4 numbers are even, program will print largest even number: ");
		if(num1Even == true && num2Even == true && num3Even == true && num4Even == true) {
			if(num1 >= num2) {
				
				if(num1 >= num3) {
					
					if(num1 >= num4) {
						
						System.out.println(num1);
						
					} else {
						
						System.out.println(num4);
					}
				} else if (num3 >= num4) {
					
					System.out.println(num3);
					
				} else {
					
					System.out.println(num4);
				} 
				
			} else if( num2 >= num3) {
					
					if(num2 >= num4) {
						

						System.out.println(num2);
						
					}else { System.out.println(num4);
					}
				} else if (num3 >= num4) { 
					System.out.println(num3);
				
				} else {
					System.out.println(num4);
				}
		}

	}
}
				

