/* Taylor Nguyen 
 * AP Computer Science 1st period
 * September 5th, 2017
 * This is the runner class for my calculate library methods
 */
public class DoMath {

	public static void main(String[] args) {
// prints method calls
		System.out.println(Calculate.square(2));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(2, 3));
		System.out.println(Calculate.average(2, 3, 4));
		System.out.println(Calculate.toDegrees(40));
		System.out.println(Calculate.toRadians(40));
		System.out.println(Calculate.discriminant(1, 2, 2));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(3, 2));
		System.out.println(Calculate.absValue(-2));
		System.out.println(Calculate.max(3, 9));
		System.out.println(Calculate.max(100, 900, 2400));
		System.out.println(Calculate.min(3, 8));
		System.out.println(Calculate.round2(24.9589));
		System.out.println(Calculate.exponent(4, 2));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(4));

	}

}
