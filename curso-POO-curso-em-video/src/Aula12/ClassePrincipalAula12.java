package Aula12;

public class ClassePrincipalAula12 {

	public static void main(String[] args) {

		// Animal n1 = new Animal(); não instancia pq animal é classe abstrata

		Ave av01 = new Ave();
		Mamifero ma01 = new Mamifero();
		Peixe pe01 = new Peixe();
		Reptil re01 = new Reptil();
		Canguru cang01 = new Canguru();
		Tartaruga tart01 = new Tartaruga();

		System.out.println("Peixe - pe01:");
		pe01.setPeso(.5);
		pe01.setIdade(99);
		pe01.setMembros(2);
		pe01.setCorEscama("Multicor");

		pe01.locomover();
		pe01.alimentar();
		pe01.emitirSom();
		pe01.soltarBolha();

		System.out.println(pe01.toString());
		System.out.println("Cor da escama: " + pe01.getCorEscama());

		System.out.println("-------------------------------------------------");
		System.out.println("Canguru:");
		System.out.println(cang01.toString());
		cang01.alimentar();
		cang01.locomover();

		System.out.println("-------------------------------------------------");
		System.out.println("Tartaruga:");
		System.out.println(tart01.toString());
		tart01.setPeso(55);
		System.out.println(tart01.getPeso());
		tart01.setCorEscama("Azul");
		System.out.println(tart01.getCorEscama());

	}

}
