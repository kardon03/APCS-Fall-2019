//Kardon Lam
//APCS Period 3
//August 29, 2019
//Library of math functions
public class Calculate {
	//A call to square returns the square of the value passed. The method accepts an integer and returns and integer. 
	public static int square(int number) {
		int answer = number * number;
		return answer;
	}
	//A call to cube returns the cube of the value passed. The method accepts an integer and returns and integer.
	public static int cube(int number) {
		int answer = number * number * number;
		return answer;
	}
	//A call to average returns the average of the values passed to it. This method accepts two doubles and returns a double
	public static double average(double number1, double number2) {
		double answer = (number1 + number2)/2;
		return answer;
	}
	//Another average method. This one accepts three doubles and returns a double. The name is the same, the difference is in the header and the calculation. (The ability to define two or more different methods with the same name but different method signatures is called overloading. This average method is an example of an "overload method".)
	public static double average(double number1, double number2, double number3) {
		double answer = (number1 + number2 + number3)/3;
		return answer;
	}
	//A call to toDegrees converts an angle measure given in radians into degrees. The method accepts a double and returns a double. The method should use 3.14159 as an approximation for pi.
	public static double toDegrees(double rad) {
		double answer = (180/3.14159) * rad;
		return answer;
	}
	//A call to toRadians converts an angle measure given in degrees into radians. The method accepts a double and returns a double. The method should use 3.14159 as an approximation for pi.
	public static double toRadians(double degree) {
		double answer = degree * (3.14159/180);
		return answer;
	}
	//A call to discriminant provides the coefficients of a quadratic equation in standard form (a, b, and c) and returns the value of the discriminant. The method accepts three doubles and returns a double.
	public static double discriminant(double a, double b, double c) {
		double answer = (b*b - 4*a*c);
		return answer;
	}
	//A call toImproperFrac converts mixed number (with its pieces provided separately in the order whole number, numerator, then denominator) into an improper fraction. The method accepts three integers and returns a String. 
	public static String toImproperFrac(int number1, int number2, int number3) {
		return ((number1 * number3 + number2) + "/" + number3);
	}
	//A call to toMixedNum converts an improper fraction (with its pieces provided separately in the order numerator then denominator) into a mixed number. The method accepts two integers and returns a String.
	public static String toMixedNum(int number1, int number2) {
		return (number1/number2) + "_" + (number1%number2) + "/" + number2;
	}
	//A call to foil converts a binomial multiplication of the form (ax + b)(cx + d) into a quadratic equation of the form ax^2 + bx + c. The method accepts four integers and a string then returns a String.
	public static String foil(int number1, int number2, int number3, int number4, String n) {
		return (number1*number3 + "n^2" + " + " + (number1*number4 + number2*number3) + "n" + " + " + number2*number4);
	}
}




