package palindromo;

public class PalindromeIdentifier {

	public boolean palindromeDetect(String phrase) {

		String palindrome = phrase.replace(" ", "");

		int j;
		int countEqualLetters = 0;
		for (int i = 0; i < palindrome.length() - 1; i++) {
			j = palindrome.length() - i - 1;
			if (palindrome.charAt(i) == palindrome.charAt(j)) {
				countEqualLetters++;
			}
		}
		if (countEqualLetters == palindrome.length() - 1) {
			return true;
		}
		return false;

	}
}
