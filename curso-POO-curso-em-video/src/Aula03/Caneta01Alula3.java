package Aula03;

public class Caneta01Alula3 {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;

	public void status() { // cria um método

		System.out.println("Modelo : " + this.modelo);
		System.out.println("Cor : " + this.cor);
		System.out.println("Ponta : " + this.ponta);
		System.out.println("Carga : " + this.carga);
		System.out.println("Está tampada ? " + this.tampada);

	}

	public void rabiscar() {

		if (this.tampada == true) {
			System.out.println("Nao posso rabiscar - Tampada");
		} else {
			System.out.println("Posso rabiscar - destampada");
		}

	}

	public void tampar() {

		this.tampada = true;
	}

	public void destampar() {

		this.tampada = false;

	}

}
