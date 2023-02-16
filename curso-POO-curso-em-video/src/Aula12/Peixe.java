package Aula12;

public class Peixe extends Animal {

	private String corEscama;

	public void soltarBolha() {

		System.out.println("PEIXE - soltarBolha()");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("PEIXE - locomover()");

	}

	@Override
	public void alimentar() {
		System.out.println("PEIXE - alimentar()");

	}

	@Override
	public void emitirSom() {
		System.out.println("PEIXE - emitirSom()");

	}

}
