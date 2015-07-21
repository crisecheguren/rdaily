/*
Challenge 5

Your challenge for today is to create a program which is password protected
and wont open unless the correct user and password is given.
For extra credit, have the user and password in a seperate .txt file.
for even more extra credit, break into your own program :)

*/
import java.util.Scanner;
import java.io.File;
import java.io.Console;


public class PasswordProtected {


	public static void main(String[] args) throws Exception {
		String user, password, accountUser, accountPassword;

		// Create a console object to obfuscate the password.
		Console console = System.console();
		// Scanner for user input.
		Scanner keyboard = new Scanner(System.in);


		System.out.println("Welcome to the program.");

		System.out.print("Username:  ");
		user = keyboard.next();

		System.out.println("Password for " + user + ":  ");

		// an array of chars from the console using .readPassword!
		char[] passString = console.readPassword();
		// takes the array and makes it a string
		password = new String(passString);


		// new file wrapped in a scanner to look for the account credentials
		Scanner accountIn = new Scanner( new File("accounts.txt") );

		System.out.println("Verifying...");

		// scans the first line of accounts.txt
		accountUser = accountIn.nextLine();
		// scans the second line of accounts.txt
		accountPassword = accountIn.nextLine();


		if ( user.equals( accountUser ) && password.equals( accountPassword ) ) {
			System.out.println("Access granted.");
		} else {
			System.out.println("Access denied.");
		}
	}
}