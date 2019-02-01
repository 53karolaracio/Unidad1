package Programas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		double incremento=0;
			DecimalFormat formateador=new DecimalFormat("####,###.##");
		System.out.println("Ingrese el precio de un producto");
		
		double precio1=leer.nextDouble();
		
		System.out.println("Ingrese el precio de un producto");
		
		double precio2=leer.nextDouble();
		
		System.out.println("Ingrese el precio de un producto");
		
		double precio3=leer.nextDouble();
		
		double total=(precio1+precio2+precio3);
		
		System.out.println(formateador.format(total));
		
		if(total>=1500) {
		
			 incremento=(total*.11);}
			else {
			 incremento=(total*.10);}
		
		
		System.out.println("El monto es: "+ total);
		
		double montototal=(total+incremento);
		
		System.out.println("El monto total es:"+ montototal);
		
		System.out.println(formateador.format(montototal));
		
		
		

	}

}
