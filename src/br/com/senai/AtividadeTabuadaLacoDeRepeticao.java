package br.com.senai;

import java.util.Scanner;

public class AtividadeTabuadaLacoDeRepeticao {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = tec.nextInt();
		int multiplicador = 1;
		System.out.println("A tabuada de: " + num );
		while(multiplicador <= 10) {
			System.out.println(multiplicador + " x " + num + " = " + num * multiplicador);
			multiplicador++;
			tec.close();
		}	
		
		
	}

}
