package Aula02;

public class TesteCelular1Classe {

	String cor;
	int bateria;
	char letra;
	boolean ligado;

	void status() {

		System.out.println("Cor : 		" + this.cor);
		System.out.println("Bateria	: 	" + this.bateria);
		System.out.println("Letra :		" + this.letra);
		System.out.println("Ligado : 	" + this.ligado);

	}

	public static int quebrar(int x, int y) {
	
		int a = x + y;
		
		return a + 500 * 10000 / 100;
		
	}
	
}
