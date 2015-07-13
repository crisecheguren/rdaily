/* Challenge #1 */

/*
Create a program that will ask the users name, age, and reddit username.

Have it tell them the information back, in the format:

your name is (blank), you are (blank) years old, and your username is (blank)
for extra credit, have the program log this information in a file to be accessed later.
*/

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GetInfo {
	public static void main ( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		String name, username, info;
		int age;

		System.out.println( "What's your name?" );
		name = keyboard.next();

		System.out.println( "Alright, " + name + ". How old are ya?" );
		age = keyboard.nextInt();

		System.out.println( "What's your reddit username?" );
		username = keyboard.next();

		info = ( "Your name is " + name + ", you are " + age +" years old, and your username is " + username + "." );

		System.out.println(info);

		try {

			System.out.println("Writing to file...");

			File file = new File("/users/coog/userInfo.txt");

			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}


			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(info);
			bw.close();

			System.out.println("Done");

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}