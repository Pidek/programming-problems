package ipv4;

import java.util.Scanner;

public class Capturar {
	
	int ip1,ip2,ip3,ip4;
	String ip;
	public String capturar()
	{
		
		System.out.print("IP: ");
		Scanner scan=new Scanner(System.in);
		
		ip1=scan.nextInt();
		
		
		ip2=scan.nextInt();
		
		ip3=scan.nextInt();
		
		ip4=scan.nextInt();
		
		scan.close();
		
		this.ip=ip1+"."+ip2+"."+ip3+"."+ip4;
		return ip;
	}
}
