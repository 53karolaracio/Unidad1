package Programas;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese numero");
		
		double numero=leer.nextDouble();
		
		if(numero%2 !=0)
			System.out.println("Impar");
		else System.out.println("Par");
		
		}

}
