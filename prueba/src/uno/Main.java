package uno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int resp;
		Capturar cap=new Capturar();
		cap.getCapturarN();
		cap.getCapturarA();
		cap.getCapturarC();
		
		Mostrar mostrar=new Mostrar();
		
		System.out.println("1.-Mostrar todo");
		System.out.println("2.-Mostrar N+A");
		System.out.println("3.-Mostrar A-N");
		System.out.println("4.-Mostrar valor numérico de C");
		Scanner s=new Scanner(System.in);
		resp=s.nextInt();
		switch(resp)
		{
		case (1):
			mostrar.mostrarAll();
		break;
		case(2):
			mostrar.mostrarNA();
		break;
		case(3):
			mostrar.mostrarDifAN();
		break;
		case(4):
			mostrar.mostrarC();
		break;
		}
	}
}
