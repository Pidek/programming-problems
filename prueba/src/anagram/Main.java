package anagram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		AnagramIdentifier anagram = new AnagramIdentifier();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write first word: ");
		String word1 = sc.nextLine();
		System.out.println("Write second word: ");
		String word2 = sc.nextLine();
		
		anagram.anagramDetect(word1, word2);
		
		if (anagram.anagramDetect(word1, word2) ) {
			System.out.println("Are an anagram");
		} else {
			System.out.println("Are not an anagram");
		}
	}
}
