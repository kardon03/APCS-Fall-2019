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
	
}




