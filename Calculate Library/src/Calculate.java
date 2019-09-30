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
	//A call to isDivisibleBy determines whether or not one integer is evenly divisivle by another. The method accepts two integers and returns a boolean.
	public static boolean isDivisibleBy(int number1, int number2) {
		return number1 % number2==0;
	}
	//A call to absValue returns the absolute value of the number passed. The method accepts a double and returns a double.
	public static double absValue(double number) {
	if (number < 0) {
		return number * -1;
	}else {
			return number;
		}
	}
	//A call to max returns the larger of the values passed. The method accepts two doubles and returns a double. 
	public static int max(int number1, int number2) {
		if (number1 > number2) {
			return number1;
		}else {
			return number2;
		}
	}
	//Overload the max method. This one accepts three doubles and returns a double
	public static double max(double number1, double number2, double number3) {
		if (number1 > number2 && number1 > number3) {
			return number1;
		}else {
			if (number2 > number1 && number2 > number3) {
			return number2;
		}else {
			return number3;
		}
		}
	}
	//A call to min returns the smaller of the values passed. The method accepts two integers and returns an int.
	public static int min(int number1, int number2) {
		if (number1 > number2) {
			return number2;
		}else {
			return number1;
		}
	}
	//A call to round2 rounds a double correctly to 2 decimal places and returns a double.
	public static double round2(double number) {
		number = number*100 + 0.5;
		number = (int) number;
		return number/100;
	}
	//A call to exponent raises a value to a positive integer power. The method accepts a double and an integer and returns a double.
	public static double exponent(double base, int power) {
		double number = base;
		for(int i = 2; i <= power; i++) {
			base *= number;
		}
		return base;
	}
	//A call to factorial returns the factorial of the value passed. The method accepts an integer and returns an integer.
	public static int factorial(int factor) {
		int number = 1;
		for(int i = 1; i<=factor; i++) {
			number = number*i;
		}
		return number;
	}
	//A call to isPrime determines whether or not an integer is prime. This method accepts an integer and returns a boolean.}
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++) {
			if(isDivisibleBy(number, i)) 
				return false;
		}
		return true;
	}
	//A call to gcf finds the greatest common factor of two integers. The method accepts two positive integers and returns an integer. 
	public static int gcf(int number1, int number2) {
		int a = max(number1, number2);
		int b = min(number1, number2);
		for(int i = 1; i > number1; i--) {
			if(isDivisibleBy(a, i)) 
			if(isDivisibleBy(b, i))
				return i;
		}
		return 1;
	}	
	//A call to sqrt returns an approximation of the square root of the value passed, rounded to two decimal places. The method accepts a double and returns a double.
	public static double sqrt(int number) {
		double ogNum;
		double squareRoot = number/2;
		do {
			ogNum = squareRoot;
			squareRoot = (ogNum + (number/ ogNum)) / 2;
		} while (ogNum - squareRoot != 0); 
			return round2(squareRoot);
	}
	//A call to quadForm uses the coefficients of a quadratic formula to approximate the real roots, if any. The method accepts three integers and returns a string.
	public static String quadForm(int a, int b, int c) {
		if(discriminant(a,b,c)<0)	
			return "no real roots";
		double root1 = round2((-b + discriminant(a,b,c)) /2*a);
		double root2 = round2((-b - discriminant(a,b,c)) /2*a);
		String output = root1 + " and " + root2;
		return output;
	}
}
	



			
		
		
	
	



		



	
			




		
	







