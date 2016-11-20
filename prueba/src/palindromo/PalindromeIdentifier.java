package palindromo;

public class PalindromeIdentifier {

	public boolean palindromeDetect(String phrase) {

		String palindrome = phrase.replace(" ", "");
		
		boolean itsPalindrome;
		int last;
		int countEqualLetters = 0;
		for (int first = 0; first < palindrome.length() - 1; first++) {
			last = palindrome.length() - first - 1;
			if (palindrome.charAt(first) == palindrome.charAt(last)) {
				countEqualLetters++;
			}
		}
		if (countEqualLetters == palindrome.length() - 1) {
			itsPalindrome = true;
		} else {
			itsPalindrome = false;
		}
		return itsPalindrome;
	}
}
