package Aula06TesteLivro;

public class Livro implements IndiceLivro {

	private int nFolhasCapitulo;
	private double porcetagemFinalLivro;
	private String nomeCapitulo;

	public Livro(int nFolhasCapitulo, double porcetagemFinalLivro, String nomeCapitulo) {
		this.nFolhasCapitulo = nFolhasCapitulo;
		this.porcetagemFinalLivro = porcetagemFinalLivro;
		this.nomeCapitulo = nomeCapitulo;
	}

	private int getnFolhasCapitulo() {
		return nFolhasCapitulo;
	}

	private void setnFolhasCapitulo(int nFolhasCapitulo) {
		this.nFolhasCapitulo = nFolhasCapitulo;
	}

	private double getPorcetagemFinalLivro() {
		return porcetagemFinalLivro;
	}

	private void setPorcetagemFinalLivro(double porcetagemFinalLivro) {
		this.porcetagemFinalLivro = porcetagemFinalLivro;
	}

	private String getNomeCapitulo() {
		return nomeCapitulo;
	}

	private void setNomeCapitulo(String nomeCapitulo) {
		this.nomeCapitulo = nomeCapitulo;
	}

	@Override
	public void capitulo01() {

		System.out.println("Método capitulo 01");

		System.out.println("------------------");
	}

	@Override
	public void capitulo02() {

		System.out.println("Método capitulo 02");
		System.out.println("==================");
	}

	@Override
	public String nomeCapitulo(String nomeCapitulo) {
		String x = nomeCapitulo;
		System.out.println(x);
		System.out.println("------//------------");
		return x;
	}

}
