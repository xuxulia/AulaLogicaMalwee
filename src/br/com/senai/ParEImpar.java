package br.com.senai;

import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.print("Informe o segundo valor: ");
		int valor2 = tec.nextInt();
		int par = 0;
		int impar = 0; 
		
		if (valor1 < valor2) {
			while (valor1 <= valor2) {
				if (valor1 % 2 == 0 ) {
					par++;
				}
				else {
					impar++;
				}
				System.out.println(valor1);
				valor1++;
			}
		}	
		else if(valor1 > valor2) {
			while (valor1 >= valor2) {
				if (valor1 % 2 == 0 ) {
					par++;
				}
				else {
					impar++;
				}
				System.out.println(valor1);
				valor1--;
				
			
			}
		}
		System.out.println("A quantidade de números pares são: " + par);
		System.out.println("A quantidade de números impares são: " + impar);

	}

}
