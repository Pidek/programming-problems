package anagram;

public class AnagramIdentifier {

	public boolean anagramDetect(String word1, String word2) {

		boolean areAnagram;
		int letterWord2;
		int countEqualLetters = 0;

		for (int letterWord1 = 0; letterWord1 < word1.length() - 1; letterWord1++) {
			letterWord2 = word2.length() - letterWord1 - 1;
			if (word1.charAt(letterWord1) == word2.charAt(letterWord2)) {
				countEqualLetters++;
			}
		}
		if ((countEqualLetters == word1.length() - 1)
				&& (word1.length() == word2.length())) {
			areAnagram = true;
		} else {
			areAnagram = false;
		}
		return areAnagram;
	}
}
