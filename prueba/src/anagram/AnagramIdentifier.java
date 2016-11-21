package anagram;

public class AnagramIdentifier {

	public boolean anagramDetect(String word1, String word2) {

		if (word1.length() != word2.length()) {
			return false;
		}
		int j;
		int countEqualLetters = 0;

		for (int i = 0; i < word1.length(); i++) {
			j = word2.length() - i - 1;
			if (word1.charAt(i) == word2.charAt(j)) {
				countEqualLetters++;
			}
		}
		return countEqualLetters == word1.length();
	}
}