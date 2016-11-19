package uno;

public class Mostrar extends Capturar{

	public void mostrarAll()
	{
		System.out.println("El valor de N es:"+this.n);
		System.out.println("El valor de A es:"+this.a);
		System.out.println("El valor de C es:"+this.c);
	}
	
	public void mostrarNA()
	{
		
		double na=(double)this.n+this.a;
		System.out.println("El valor de N + A es:"+na);
	}
	
	public void mostrarC()
	{
		int intC=(int)this.c;
		System.out.println("el valor de C es: "+intC);
	}
	
	public void mostrarDifAN()
	{
		double an=(double)this.a-this.n;
		System.out.println("Diferencia A-N es: "+an);
	}
	
	
	
}
