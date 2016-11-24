package numRepeated;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Give me a string of numbers: ");
		Scanner scan= new Scanner (System.in);
		String numbers=scan.next();
		StringAnalizer repeatedCounter=new StringAnalizer();
		repeatedCounter.numbersRepeated(numbers);
	}
}
