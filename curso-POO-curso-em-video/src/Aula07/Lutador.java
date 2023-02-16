package Aula07;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias, derrotas, empates; // pode ser assim

	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso,
			int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		//this.categoria = getCategoria();
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	
	public void apresentar() {
		System.out.println("MÉTODO APRESENTAR: ");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Nacionalidade : " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
	}

	public void status() {
		System.out.println("MÉTODO status: ");
		System.out.println("Nome lutador: " + this.nome);
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Vitórias: " + this.vitorias);
		System.out.println("Derrotas: " + this.derrotas);
		System.out.println("Empates: " + this.empates);
	}

	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
	}

	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {

		if (getPeso() < 52.2) {
			this.categoria = "Inválido - peso abaixo do necessário";

		} else if ((getPeso() >= 52.2) && (getPeso() <= 70.3)) {
			this.categoria = "LEVE";

		} else if ((getPeso() > 70.3) && (getPeso() <= 83.9)) {
			this.categoria = "MÉDIO";

		} else if ((getPeso() > 83.9) && (getPeso() <= 120.2)) {
			this.categoria = "PESADO";

		} else if (getPeso() > 120.2) {
			this.categoria = "Inválido - peso acima do permitido";
		}

	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	


	
}
