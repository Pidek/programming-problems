package numRepeated;

import java.util.HashMap;

public class StringAnalizer {

	public void numbersRepeated(String numbers) {
		HashMap<Character, Integer> counterMap = new HashMap<Character, Integer>();

		for (int i = 0; i < numbers.length(); i++) {
			int counter = 0;
			char number = numbers.charAt(i);
			if (!counterMap.containsKey(number)) {
				for (int j = i; j < numbers.length(); j++) {
					char numberCompared = numbers.charAt(j);
					if (number == numberCompared) {
						counter++;
					}
				}
			}
			if (counter > 1) {
				System.out.println("The number " + number + " is repeated "+ counter + " times");
				counterMap.put(number, counter);
			}
		}
		if (counterMap.isEmpty())
			System.out.println("No repeated values");
	}
}
