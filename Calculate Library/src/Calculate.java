/*Taylor Nguyen
 AP Compsci period 1
 September 5th, 2017
 This is our library that will contain various mathematical methods 
*/
public class Calculate {
	
/* this method takes an integer and returns its square */
	public static int square(int operand) {
		return operand * operand;
		
	}

/* this method takes in an integer and returns its cube */
	public static int cube(int operand2) {
		return operand2 * operand2 * operand2;
		
	}

// this method find the average of two numbers
	public static double average(double number01, double number02) {
		return (number01 + number02)/2;
}

// this method finds the average of three numbers
	public static double average(double number1, double number2, double number3 ) {
		return (number1 + number2 + number3)/3;
		
	}

// this method converts radians into degrees
	public static double toDegrees(double angleRadians) {
		return angleRadians * (180/3.14159);
	}
	
// this method converts degrees into radians	
	public static double toRadians(double angleDegrees) {
		return angleDegrees * (3.14159/180);
	}

// this method finds the discriminant of 3 numbers
	public static double discriminant(double a, double b, double c) {
	    return (b * b) - (4 * a * c);
	  }
 
// this method finds an improper fraction of a mixed number
	public static String toImproperFrac(int sideNumber, int topNumber, int bottomNumber) {
		 return ((sideNumber * bottomNumber) + topNumber) + "/" + (bottomNumber);
	}

// this method finds a mixed number from an improper fraction
	public static String toMixedNum(int top, int bottom) {
		return (top / bottom) + "_" + (top % bottom) + "/" + bottom;
	}

// this method foils (ax + b)(cx + d) into ax^2 + bx + c form (quadratic equation)
	public static String foil(int num1, int num2, int num3, int num4, String v) {
		return (num1 * num3) + v + "^2 + " + ((num1 * num4) + (num2 * num3)) + v + " + " + (num2 * num4); 
	}
	
// this method determines if two integers are divisible by each other
	public static boolean isDivisibleBy(int num, int num02) {
		if(num % num02 == 0) {
			return true;
	} else {
		return false;
			
	}
	}

// this method returns the absolute number of a value
	public static double absValue(double origNum) {
		if(origNum < 0) {
			return origNum * -1;
		} else {
			return origNum;
		}
		}
// this method returns the larger value out of two numbers
	public static double max(double num1, double num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
//this method returns the larger value out of three numbers
	public static double max(double num1, double num2, double num3) {
		if(num1 > num2) {
			if(num1 > num3) {
				return num1;
		}
		}
		
			if(num2 > num3) {
				return num2; 
		} else {
				return num3;
			}
	}

// this method returns the lesser value of two integers 
	public static int min(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
// this method a double to 2 decimal points and returns a double
	public static double round2(double num1) {
		double result = 0.0;
		
		int tempInt = (int)(num1 * 1000);
		int roundNum = tempInt % 10;
		tempInt = tempInt / 10;
		if(roundNum >= 5 && tempInt < 0) {
			tempInt++;
		} else if(roundNum <= -5 && tempInt < 0) {
			tempInt--;
		}
		result = tempInt / 100.0;
		return result;
	}
	
// this method accepts a double and an integer and returns a double (exponents)
	public static double exponent(double operand, int operand2) {
		double operand3 = operand * operand;
		operand2 = operand2 - 3;
		while(operand2 >= 0) {
			operand3 = operand3 * operand;
			operand2 --;
		}
		return operand3;
	}
	
//this method accepts integer and mutltiplies it by its factoral
	public static int factorial(int num) {
		if(num <=2) {
			return num;
		}
		int totalNum = num * (num - 1); 
		int num2 = num;
		num2 = num2 - 2;
		while(num2 > 0) {
			totalNum = totalNum * num2;
			num2 --;
			
		}
		return totalNum;
	}

//this method calls another method to help figure out if a number is prime
	public static boolean isPrime(int num1) {
		if(num1 == 2) {
			return true;
		}
			if(isDivisibleBy(num1, 2) == true) {
	
			return false; 
		}else {
			return true;
		}
	}

//this method calls another method to help figure out the greatest common factor between two integers
	public static int gcf(int num1, int num2) {
		
		
	}
}


