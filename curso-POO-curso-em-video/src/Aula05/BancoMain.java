package Aula05;

import java.util.Scanner;

public class BancoMain {

	public static void main(String[] args) {

		int opcao;

		Scanner teclado = new Scanner(System.in);

		Banco conta01 = new Banco("Angelo", "CC", 191919, 0.0);

		System.out.println("Dados da conta e saldo incial:");
		System.out.println("------------------------------");

		conta01.status();

		do {

			System.out.println("------------------------------");
			System.out.print("Qual operação deseja realizar: ");
			System.out.println("");
			System.out.println("1 - Depositar \n2 - Sacar \n3 - Consultar saldo");
			int opcaoCliente = teclado.nextInt();

			if (opcaoCliente == 1) {

				System.out.print("Quando deseja depositar na CC:");

				double novoDeposito = teclado.nextDouble();

				conta01.Depositar(novoDeposito);

			} else if (opcaoCliente == 2) {

				System.out.print("Quando deseja SACAR da CC:");

				double novoSaque = teclado.nextDouble();

				conta01.Sacar(-novoSaque);

			} else if (opcaoCliente == 3) {
				System.out.println("------------------------------");
				System.out.println("Saldo da CC: " + conta01.getSaldoConta());
			}

			else {
				System.out.println("------------------------------");
				System.out.println("Opção inválida - Escolha novamente a opção");
			}

			System.out.println("------------------------------");
			System.out.println("Saldo atual da CC: " + conta01.getSaldoConta());

			System.out.println("------------------------------");
			System.out.println("Deseja efetuar nova operação - 1 (Sim) / 2 (Não)");

			opcao = teclado.nextInt();

		} while (opcao != 2);

		System.out.println("+++++++++=================++++++++++++++");
		System.out.println("OBRIGADO POR UTILIZAR NOSSOS SERVIÇOS!!!");
		System.out.println("+++++++++=================++++++++++++++");

	
	}

}
