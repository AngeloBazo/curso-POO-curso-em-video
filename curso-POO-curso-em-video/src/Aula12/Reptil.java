package Aula12;

public class Reptil extends Animal {

	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("REPTIL - locomover()");
		
	}

	@Override
	public void alimentar() {
		System.out.println("REPTIL - alimentar()");
		
		
	}

	@Override
	public void emitirSom() {
		System.out.println("REPTIL - emitirSom()");
		
	}

}
