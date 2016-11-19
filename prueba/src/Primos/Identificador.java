package Primos;

public class Identificador {

	public double num;
	 public void identificador()
	 {
		 int contador=0;
		 for(int i=1;i<num+1;i++)
		 {
			 if((num/i) % 1==0)
				 contador++;
		 }
		 
		 if(contador==2)
			 System.out.println("El número es primo");
		 else
		 System.out.println("El número no es primo");
		 
	 }
}
