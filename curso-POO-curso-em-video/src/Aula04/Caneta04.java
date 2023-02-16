package Aula04;

public class Caneta04 {

	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;

	public Caneta04(String m, String c, float p) { // método construtor - mesmo nome da classe (não colocar void)

		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.tampar();
		this.cor = "Azul";

	}

	public String getModelo() { // GET
		return this.modelo;
	}

	public void setModelo(String m) { // SET
		this.modelo = m;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;

	}

	public void status() {
		System.out.println("Sobre a caneta : ");
		System.out.println("Modelo : " + this.modelo);
		System.out.println("Modelo : " + this.ponta);
		System.out.println("Cor : " + this.cor);
		System.out.println("Tampada : " + this.tampada);
	}

}
