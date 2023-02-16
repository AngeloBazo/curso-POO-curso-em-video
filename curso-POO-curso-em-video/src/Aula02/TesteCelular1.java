package Aula02;

public class TesteCelular1 {

	public static void main(String[] args) {

		TesteCelular1Classe cel1 = new TesteCelular1Classe();

		cel1.cor = "Preto";
		cel1.bateria = 85;
		cel1.letra = 'y';
		cel1.ligado = true;

		cel1.status();

		System.out.println("------------------------");

		TesteCelular1Classe celular2 = new TesteCelular1Classe();

		celular2.cor = "Blue";
		celular2.bateria = 50;
		celular2.letra = 'b';
		celular2.ligado = false;

		celular2.status();

		System.out.println("------------------------");
		
		System.out.println("Teste método c/ retorno " + celular2.quebrar(5,100));

	}

}
