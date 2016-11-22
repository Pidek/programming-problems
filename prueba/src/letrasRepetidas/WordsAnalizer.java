package letrasRepetidas;

import java.util.HashMap;

public class WordsAnalizer {

	HashMap<Integer, Character> lettersInMap = new HashMap<Integer, Character>();

	public void fillLettersInMap(String word) {
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			lettersInMap.put(i, letter);
		}
	}

	public HashMap<Character, Integer> lettersRepeatedCounter(String word) {

		HashMap<Character, Integer> countContainer = new HashMap<Character, Integer>();

		for (int x = 0; x < word.length() - 1; x++) {
			int counter = 0;
			for (int y = 0; y < word.length(); y++) {
				char letterCompared = word.charAt(y);
				if (lettersInMap.get(x) == letterCompared)
					counter++;
			}
			if (counter > 1)
				countContainer.put(lettersInMap.get(x), counter);
		}
		return countContainer;
	}
}
