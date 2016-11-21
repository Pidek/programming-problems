package anagram;

public class AnagramIdentifier {

	public boolean anagramDetect(String word1, String word2) {

		if (word1.length() == word2.length()) {

			int j;
			int countEqualLetters = 0;

			for (int i = 0; i < word1.length() - 1; i++) {
				j = word2.length() - i - 1;
				if (word1.charAt(i) == word2.charAt(j)) {
					countEqualLetters++;
				}
			}
			if ((countEqualLetters == word1.length() - 1)) {
				return true;
			} else {
				return false;
			}
		}

		else {
			return false;
		}
	}
}
