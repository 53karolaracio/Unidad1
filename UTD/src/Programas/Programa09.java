package Programas;

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Seleccione una opcion de menu");
		System.out.println("1.-Pulgadas a centimetros");
		System.out.println("2.-Pies a centimetros");
		System.out.println("3.-Pies a pulgadas");
		
		byte numero=leer.nextByte();
		
		switch(numero){
		case 1: System.out.println("Pulgadas a centimetros");
			System.out.println("Ingrese las pulgadas que se desean convertir");
			double pulgadas=leer.nextDouble();
			double centimetros=pulgadas*2.54;
			System.out.println(centimetros+"cm");
		break;
		case 2: System.out.println("pies a centimetros");
			System.out.println("Ingrese los pies que se desean convertir");
			double pies=leer.nextDouble();
			double centimetros1=pies*30.48;
			System.out.println(centimetros1+"cm");
		break;
		case 3: System.out.println("Pies a pulgadas");
		System.out.println("Ingrese los pies que se desean convertir");
			double pies1=leer.nextDouble();
			double pulgadas2=pies1*12;
			System.out.println(pulgadas2+"pulgadas");
		break;
		default: System.out.println("Valor no valido, ingrese otro valor");
		
		    
		
		}
	

	}

}
