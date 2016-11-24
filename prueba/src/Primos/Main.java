package Primos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Identificador identifica=new Identificador();
		Scanner scan=new Scanner(System.in);
		System.out.println("Número: ");
		identifica.num=scan.nextInt();
		identifica.identificador();
	}
}
