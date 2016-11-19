package uno;
import java.util.Locale;
import java.util.Scanner;

public class Capturar {
	int n;
	double a;
	char c;

	public int getCapturarN()
	{
		System.out.println("Valor de N: ");
		Scanner sn=new Scanner(System.in);
		this.n=sn.nextInt();
		return this.n;
	}
	
	public double getCapturarA()
	{
		System.out.println("Valor de a: ");
		Scanner sa=new Scanner(System.in).useLocale(Locale.US);
		this.a=sa.nextDouble();
		return a;
		
	}
	
	public char getCapturarC()
	{
		System.out.println("Valor de C: ");
		Scanner sc=new Scanner(System.in);
		this.c=(char) sc.nextInt();
		return this.c;
	}
}
