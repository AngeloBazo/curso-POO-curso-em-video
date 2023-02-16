package Aula13;

public class ProgramaPrincipalAula13 {

	public static void main(String[] args) {
		
		//Animal x = new Animal();
		
		Mamifero x = new Mamifero();
		x.emitirSom();
		
		Lobo lobo01 = new Lobo();
		lobo01.emitirSom();
		
		Cachorro ca01 = new Cachorro();
		
		System.out.println("-----------------------");
		System.out.println("Cachorro:");
		ca01.reagir(true);
		ca01.reagir("String");
		ca01.reagir(1, 5.0);
		ca01.reagir(5, 20);

	}

}
