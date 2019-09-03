//Kardon Lam
//APCS Period 3
//August 29, 2019
//Call the code from the Calculate class (aka client or runner code)
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(2));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(2, 3));
		System.out.println(Calculate.average(2, 3, 4));
		System.out.println(Calculate.toDegrees(2));
		System.out.println(Calculate.toRadians(2));
		System.out.println(Calculate.discriminant(2, 3, 4));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
	}

}
