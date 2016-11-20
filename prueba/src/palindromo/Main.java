package palindromo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		PalindromeIdentifier palindro = new PalindromeIdentifier();
		
		System.out.println("Write a phrase: ");
		Scanner sc = new Scanner(System.in);
		String phrase = sc.nextLine();
		
		palindro.palindromeDetect(phrase);

		if (palindro.palindromeDetect(phrase) == true) {
			System.out.println("It´s a palindrome");
		} else {
			System.out.println("It's not a palindrome");
		}
	}
}
