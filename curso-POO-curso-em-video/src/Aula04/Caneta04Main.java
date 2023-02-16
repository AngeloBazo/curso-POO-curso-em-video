package Aula04;

public class Caneta04Main {

	public static void main(String[] args) {

		Caneta04 c1 = new Caneta04(null, null, 0);

		c1.setModelo("BIC");

		c1.setPonta(0.5f);

		c1.status();

		System.out.println("Minha caneta 01 tem a ponta : " + c1.getPonta());

		System.out.println("Minha caneta 01 tem o modelo : " + c1.getModelo());

		System.out.println("------------------------------------------");
		
		Caneta04 c2 = new Caneta04("Bic - II", "Roxa", 0.9f);
		c2.status();

	}

}
