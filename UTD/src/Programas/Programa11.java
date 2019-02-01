package Programas;

import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Seleccione una opcion de menu");
		System.out.println("1.-Pulgadas a centimetros");
		System.out.println("2.-Pies a centimetros");
		System.out.println("3.-Pies a pulgadas");
		System.out.println("4.-Finalizar");
		
		byte numero=leer.nextByte();
		
		do{
		
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
		
		}
		} while (numero>4);
		if (numero==4){
			System.out.println ("Usted eligio salir del programa");
	} else {
		System.out.println ("La ejecución ha terminado");
	}
	
	}
}


