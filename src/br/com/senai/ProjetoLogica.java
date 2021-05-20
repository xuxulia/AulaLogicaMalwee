package br.com.senai;

import java.util.Scanner;

public class ProjetoLogica {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		String continuar = "s";
		int opcao;

		do {
			System.out.println("---MENU---");
			System.out.println("1) Verificar sexo e idade");
			System.out.println("2) Contagem de valores");
			System.out.println("3) Tabuada");
			System.out.println("4) cadastros de cursos");
			System.out.println("5) Sair");
			System.out.println("------------------");
			System.out.println("Informe a opção desejada: ");
			opcao = tec.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("---VERIFICAR SEXO E IDADE---");
				System.out.print("Informe seu nome: ");
				String nome = tec.next();
				System.out.print("Informe seu ano de nascimento: ");
				int anoDeNascimento = tec.nextInt();
				System.out.print("Informe seu sexo [M/F]: ");
				String sexo = tec.next();
				int idade = 2021 - anoDeNascimento;

				if (sexo.equalsIgnoreCase("M")) {
					System.out.println("Você é do sexo masculino");
				} else if (sexo.equalsIgnoreCase("F")) {
					System.out.println("Você é do sexo feminino");
				} else if (!sexo.equalsIgnoreCase("M") || !sexo.equalsIgnoreCase("F")) {
					System.out.println("Opção inválida!");
				}

				if (idade < 12) {
					System.out.println("Você ainda é criança");

				} else if (idade >= 12 && idade < 18) {
					System.out.println("Você é jovem");

				} else if (idade >= 18 && idade < 65) {
					System.out.println("Você é adulto");

				} else {
					System.out.println("Você já é idoso");
				}

				if (idade < 16) {
					System.out.println("Você não pode votar");

				} else if ((idade >= 16 && idade < 18) || idade > 70) {
					System.out.println("seu voto é opcional");

				} else {
					System.out.println("seu voto é obrigatório");

				}
				if (idade < 18) {
					System.out.println("Você não pode tirar a habilitação");
				} else {
					System.out.println("Você já pode tirar a habilitação");
				}

				break;

			case 2:
				System.out.println("---CONTAGEM DE VALORES---");
				System.out.print("Informe o primeiro valor: ");
				int primeiroValor = tec.nextInt();
				System.out.print("Informe o segundo valor: ");
				int segundoValor = tec.nextInt();

				if (primeiroValor < segundoValor) {
					while (primeiroValor <= segundoValor) {
						System.out.println(primeiroValor);
						primeiroValor++;
					}
				} else if (primeiroValor > segundoValor) {
					while (primeiroValor >= segundoValor) {
						System.out.println(primeiroValor);
						primeiroValor--;

					}
				}

				else {
					System.out.println("Valor igual ao primeiro, impossível imprimir a sequência");
				}
				break;

			case 3:
				System.out.println("---TABUADA---");
				System.out.print("Informe um número: ");
				int valor = tec.nextInt();
				int multiplicador = 1;
				System.out.println("A tabuada de: " + valor);
				while (multiplicador <= 10) {
					System.out.println(multiplicador + " x " + valor + " = " + (valor * multiplicador));
					multiplicador++;
				}

				break;

			case 4:
				String[] cursos = new String[5];
				String inserirCurso = "s";
				int aux = 0;
				System.out.println("4 - Cadastrar cursos");
				System.out.println(" ");
				while (inserirCurso.equalsIgnoreCase("s") && aux < 5) {
					System.out.print("Informe o curso: ");
					cursos[aux] = tec.next();
					aux++;
					if (aux < 5) {
						System.out.print("Deseja inseir outro curso? ");
						inserirCurso = tec.next();
					} else {

					}
				}
				System.out.print("CURSOS:");
				if (aux == 1) {
					System.out.println(cursos[0] + ".");
				} else if (aux == 2) {
					System.out.println(cursos[0] + "," + cursos[1] + ".");
				} else if (aux == 3) {
					System.out.println(cursos[0] + "," + cursos[1] + "," + cursos[2] + ".");
				} else if (aux == 4) {
					System.out.println(cursos[0] + "," + cursos[1] + "," + cursos[2] + "," + cursos[3] + ".");
				} else {
					System.out.println(
							cursos[0] + "," + cursos[1] + "," + cursos[2] + "," + cursos[3] + "," + cursos[4] + ".");
				}
				break;
			case 5:
				continuar = "n";
				break;

			default:
				System.out.println("Opção Inválida!");
				break;
			}

		} while (continuar.equalsIgnoreCase("s"));
		System.out.println("Sistema finalizado!!");

	}

}
