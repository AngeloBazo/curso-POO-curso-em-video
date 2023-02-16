package Aula02;

public class Aula02 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta(); // instância o objeto caneta

		c1.cor = "Azul"; // chamada para os atributos
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.carga = 90;

		c1.status(); // chamada para métodos

		c1.destampar();

		c1.rabiscar();

		System.out.println("--------------------");

		Caneta c2 = new Caneta();

		c2.modelo = "bic2";
		c2.cor = "preta";

		c2.status(); // chamada para métodos

		c2.tampar();

		c2.rabiscar();

	}

}
