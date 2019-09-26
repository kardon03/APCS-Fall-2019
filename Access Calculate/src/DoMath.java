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
		System.out.println(Calculate.isDivisibleBy(4,2));
		System.out.println(Calculate.absValue(-3));
		System.out.println(Calculate.max(2, 3));
		System.out.println(Calculate.max(1, 2, 3));
		System.out.println(Calculate.min(1, 2));
		System.out.println(Calculate.round2(3.1447));
		System.out.println(Calculate.exponent(2, 5));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(7));
		System.out.println(Calculate.gcf(2, 4));
		System.out.println(Calculate.sqrt(5));
	}

}
