/* Challenge 2: Hello, coders! An important part of programming is being able to apply your programs,
so your challenge for today is to create a calculator application that has use in your life. It might be an interest calculator,
or it might be something that you can use in the classroom.
For example, if you were in physics class, you might want to make a F = M * A calc.

EXTRA CREDIT: make the calculator have multiple functions! Not only should it be able to calculate F = M * A,
but also A = F/M, and M = F/A!
*/

import java.util.Scanner;

public class PhysicsCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);



		System.out.println("What are we solving for? (1-3)");
		System.out.println("1) Force\n2) Mass\n3) Acceleration\n");
		System.out.print(">   ");
		int choice = keyboard.nextInt();

		if (choice == 1) {
			// F = m * a
			System.out.println( fma() );
		} else if (choice == 2) {
			// m = F / a
			System.out.println( mfa() );
		} else if (choice == 3) {
			// a = F / m
			System.out.println( afm() );
		} else {
			// error message "wat do you mean?"
			System.out.println("I don't know what you mean.");
		}


	}

	public static double fma() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's the mass? (kg)");
		System.out.print(">   ");
		double m = keyboard.nextDouble();
		System.out.println("What is the acceleration? (m/s squared)");
		System.out.print(">   ");
		double a = keyboard.nextDouble();

		return m * a;
	}

	public static double mfa() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's the force? (N)");
		System.out.print(">   ");
		double f = keyboard.nextDouble();
		System.out.println("What's the acceleration? (m/s squared)");
		System.out.print(">   ");
		double a = keyboard.nextDouble();

		return f / a;
	}

	public static double afm() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's the force? (N)");
		System.out.print(">   ");
		double f = keyboard.nextDouble();
		System.out.println("What's the mass? (kg)");
		System.out.print(">   ");
		double m = keyboard.nextDouble();

		return f / m;
	}

}