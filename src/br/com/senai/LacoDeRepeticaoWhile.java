package br.com.senai;

public class LacoDeRepeticaoWhile {

	public static void main(String[] args) {
		int valor = 0;
		System.out.println("Valor: " + valor);
		
		while(valor <= 25) {
			System.out.println("-> Valor: " + valor);
			valor += 1;
		}
		
		System.out.println("Agora o valor �: " + valor);

	}

}
