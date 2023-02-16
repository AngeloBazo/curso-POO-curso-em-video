package Aula13;

public class Cachorro extends Lobo {

	public void reagir(String frase) {

		System.out.println("String frase");

	}

	public void reagir(int hora, int min) {

		System.out.println("int hora, int min");

	}

	public void reagir(boolean dono) {
		System.out.println("boolean dono");

	}

	public void reagir(int idade, double peso) {
		System.out.println("int idade, double peso");


	}

}
