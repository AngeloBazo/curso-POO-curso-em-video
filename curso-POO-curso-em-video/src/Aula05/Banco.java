package Aula05;

public class Banco {

	private String propConta;
	public String tipoConta;
	protected int numeroConta;
	private double saldoConta;

	public Banco(String propConta, String tipoConta, int numeroConta, double saldoConta) {
		super();
		this.propConta = propConta;
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
	}

	public double Depositar(double novoDeposito) {

		setSaldoConta(getSaldoConta() + novoDeposito);

		return saldoConta;

	}

	public double Sacar(double novoSaque) {

		setSaldoConta(getSaldoConta() + novoSaque);

		return saldoConta;

	}

	public void Consultar() {

	}

	public String getPropConta() {
		return propConta;
	}

	public void setPropConta(String propConta) {
		this.propConta = propConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoConta() {

		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {

		this.saldoConta = saldoConta;

	}

	public void status() {
		System.out.println("Prop da conta:		" + propConta);
		System.out.println("Tipo de conta:		" + tipoConta);
		System.out.println("Número da conta:	" + numeroConta);
		System.out.println("Saldo da conta:		" + saldoConta);

	}

}
