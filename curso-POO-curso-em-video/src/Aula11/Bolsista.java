package Aula11;

public class Bolsista extends Aluno {

	private int bolsa;

	public void renovarBolsa() {
		System.out.println("Renovando bolsa de ... " + this.getNome());

	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public void pagarMensalidade() {
		System.out.println("Sobrescrevendo método pagarMensalidade!!! ");

	}

}
