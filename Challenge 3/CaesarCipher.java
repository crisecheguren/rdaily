/*
Challenge #3

Welcome to cipher day!

Write a program that can encrypt texts with an alphabetical caesar cipher.

This cipher can ignore numbers, symbols, and whitespace.

For extra credit: add a "decrypt" function to your program!
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CaesarCipher {

	// a shiftLetter method that returns a char it takes two arguments char c and int n
	public static char shiftLetter( char c, int n ) {

		// an int named ch with the value of char c
		int ch = c;
		// if char c is not a letter then return c
		if ( ! Character.isLetter(c) )
			return c;

		// int ch equals ch plus n
		ch = ch + n;

		if ( Character.isUpperCase(c) && ch > 'Z' || Character.isLowerCase(c) && ch > 'z' )
			ch -= 26;
		if ( Character.isUpperCase(c) && ch < 'A' || Character.isLowerCase(c) && ch < 'a')
			ch += 26;

		return (char)ch;
	}

		public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		PrintWriter encrypted;

		int choice;
		int shift;
		String message;
		String cipher = "";



		//would you like to encrypt or decrypt?
		System.out.println("Would you like to encrypt or decrypt today? (1-2)");
		System.out.print("1) Encrpyt\n2) Decrypt");
		System.out.print("\n>   ");
		choice = keyboard.nextInt();


		//if encrypt
		if (choice == 1) {


			Scanner messageIn = new Scanner( new File("message.txt") );
			System.out.println("Getting secret message from file.");
			message = messageIn.nextLine();
			System.out.println("Done.");
			// System.out.println("The message is " + "\"" + message + "\"");



			System.out.println("Shift (0-26):  ");
			shift = keyboard.nextInt();

			for ( int i = 0; i < message.length(); i++ ) {
				cipher += shiftLetter( message.charAt(i), shift );
			}

			// System.out.println(cipher);

			encrypted = new PrintWriter( new FileWriter( "encrypted.txt") );
			encrypted.println(cipher);
			encrypted.close();

		} else if (choice == 2) {

			Scanner encryptIn = new Scanner( new File("encrypted.txt") );
			System.out.println("Getting secret message from file.");
			message = encryptIn.nextLine();
			System.out.println("Done.");

			System.out.println("Shift (-26-0):  ");
			shift = keyboard.nextInt();

			for ( int i = 0; i < message.length(); i++ ) {
				cipher += shiftLetter( message.charAt(i), shift );
			}

			encrypted = new PrintWriter( new FileWriter( "message.txt") );
			encrypted.println(cipher);
			encrypted.close();

		} else {
			System.out.println("I'm sorry, I don't understand.");
		}


	}


}