/* Taylor Nguyen 
 * September 5th, 2017
 * This is the runner class for my calculate library methods
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(2, 3));
		System.out.println(Calculate.average(2, 3, 4));
		System.out.println(Calculate.toDegrees(40));
		System.out.println(Calculate.toRadians(40));
		System.out.println(Calculate.discriminant(1, 2, 2));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));

	}

}
