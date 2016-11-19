package ipv4;

public class Identificador extends Capturar{

	Capturar captura=new Capturar();
	public void comparar()
	{
		captura.capturar();
		if (((((captura.ip1>=0 && captura.ip1<=255))&&
				((captura.ip2>=0 && captura.ip2<=255)))&&
				((captura.ip3>=0 && captura.ip3<=255)))&& 
				((captura.ip4>=0 && captura.ip4<=255)))
			
						System.out.println("La dirección "+captura.ip+" Sí es IPv4");
					else 
						System.out.println("La dirección dada no es IPv4");
			
	}
	
}
