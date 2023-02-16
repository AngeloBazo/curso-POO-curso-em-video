package Aula12;

public class Ave extends Animal {

	private String corPena;

	public void fazerNinho() {

		System.out.println("Classe AVE - fazerNinho()");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void locomover() {
		System.out.println("AVE - locomover()");

	}

	@Override
	public void alimentar() {
		System.out.println("AVE - alimentar()");

	}

	@Override
	public void emitirSom() {
		System.out.println("AVE - emitirSom()");

	}

}
