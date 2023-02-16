package Aula12;

public class Mamifero extends Animal {

	private String corPelo;

	

	@Override
	public void locomover() {
		System.out.println("MAMIFERO - locomover()");
		
	}

	@Override
	public void alimentar() {
		System.out.println("MAMIFERO - alimentar()");
		
	}

	@Override
	public void emitirSom() {

		System.out.println("MAMIFERO - emitirSom()");		
	}

	
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
}
