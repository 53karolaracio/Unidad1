package Programas;

import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribir edad");
		
		int edad=leer.nextInt();
		
		if(edad>=18)
			System.out.println("Si es mayor de edad");
		if(edad<18)
			System.out.println("No es mayor de edad");
		
		

	}

}
