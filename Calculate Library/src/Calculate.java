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
	
	public static int cube(int operand2) {
		return operand2 * operand2 * operand2;
		
	}
	
	public static double average(double number01, double number02) {
		return (number01 + number02)/2;
}
	
	public static double average(double number1, double number2, double number3 ) {
		return (number1 + number2 + number3)/3;
		
	}
	
	public static double toDegrees(double angleRadians) {
		return angleRadians * (180/3.14159);
	}
	
	public static double toRadians(double angleDegrees) {
		return angleDegrees * (3.14159/180);
	}
	
	public static double discriminant(double a, double b, double c) {
	    return (b * b) - (4 * a * c);
	  }
 
	public static String toImproperFrac(int sideNumber, int topNumber, int bottomNumber) {
		 return ((sideNumber * bottomNumber) + topNumber) + "/" + (bottomNumber);
	}
	
	public static String toMixedNum(int top, int bottom) {
		return (top / bottom) + "_" + (top % bottom) + "/" + bottom;
	}
	
	public static String foil(int num1, int num2, int num3, int num4, String v) {
		return (num1 * num3) + v + "^2 + " + ((num1 * num4) + (num2 * num3)) + v + " + " + (num2 * num4); 
	}
}
