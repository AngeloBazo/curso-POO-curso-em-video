package Aula02;

public class Caneta {

	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	void status() { // cria um método

		System.out.println("Modelo : " + this.modelo);
		System.out.println("Cor : " + this.cor);
		System.out.println("Ponta : " + this.ponta);
		System.out.println("Carga : " + this.carga);
		System.out.println("Está tampada ? " + this.tampada);

	}

	void rabiscar() {

		if (this.tampada == true) {
			System.out.println("Nao posso rabiscar - Tampada");
		} else {
			System.out.println("Posso rabiscar - destampada");
		}

	}

	void tampar() {

		this.tampada = true;
	}

	void destampar() {

		this.tampada = false;

	}

}
