package letrasRepetidas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a word: ");
		String word = scan.next();
		WordsAnalizer wordAnalizer = new WordsAnalizer();
		wordAnalizer.fillLettersInMap(word);
		System.out.println(wordAnalizer.lettersRepeatedCounter(word));

	}
}
