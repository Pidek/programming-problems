package letrasRepetidas;

import java.util.HashMap;

public class WordsAnalizer {

	HashMap<Integer, Character> lettersInMap = new HashMap<Integer, Character>();
	HashMap<Character, Integer> countContainer = new HashMap<Character, Integer>();

	public HashMap<Character, Integer> lettersRepeatedCounter(String word) {

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);

			if (lettersInMap.containsValue(letter)) {
				if (countContainer.get(letter) == null)
					countContainer.put(letter, 1);
				
				countContainer.put(letter, countContainer.get(letter) + 1);
			}
			lettersInMap.put(i, letter);
		}
		return countContainer;
	}
}
