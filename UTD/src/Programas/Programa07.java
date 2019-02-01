package Programas;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese valor de temperatura en grados Fahrenheit");
		
		double temperatura=leer.nextDouble();
		
		double c=(temperatura-32)/1.8;
		
		System.out.println("temperatura en grados fahrenheit" + temperatura);
		System.out.println("temperatura en grados centigrados" + c);
		
		

	}

}
