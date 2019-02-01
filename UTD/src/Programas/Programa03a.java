package Programas;

import java.util.Scanner;

public class Programa03a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer=new Scanner(System.in);

		
		System.out.println("Escribir un nombre");
		
		String nombre=leer.nextLine();
		
		System.out.println("Escribir Edad");
		
		int edad=leer.nextInt();
		
		System.out.println("Escribir Altura");
		
		double altura=leer.nextDouble();
		
		System.out.println("nombre:" + nombre);
		System.out.println("edad:" + edad);
		System.out.println("altura:" + altura);
		
		
		
	}

}
