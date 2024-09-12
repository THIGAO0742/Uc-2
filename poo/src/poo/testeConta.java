package poo;

import java.util.Scanner;

public class testeConta {
	public static Scanner tec = new Scanner(System.in);

	public static void op() {
		System.out.println(" ");
		System.out.println("1 - Criar Conta");
		System.out.println("2 - Déposito");
		System.out.println("3 - Saque");
		System.out.println("4 - Rendimento Mensal");
		System.out.println("5 - Dados da conta");
		System.out.println("0 - Sair");
		System.out.println(" ");
		System.out.print("Digite sua Opção: ");
		System.out.print(" ");

	}

	public static void main(String[] args) {

		int opcao = 8;
		conta cBancaria = new conta();
		System.out.println("Banco TEC");

		while (opcao != 0) {
			op();
			opcao = tec.nextInt();

			switch (opcao) {
			case 1:
				cBancaria.lerDados();
				break;
			case 2:
				cBancaria.deposito();
				break;
			case 3:
				cBancaria.sacar();
				break;
			case 4:
				cBancaria.calcularRend();
				break;
			case 5:
				cBancaria.mostrarDados();
				break;
			case 0:
				System.out.println("Saindo da conta");
				cBancaria.mostrarDados();
				break;

			default:
				break;
			}// switch
		} // while

	}// main

}
