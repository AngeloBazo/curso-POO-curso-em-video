package Aula14;

public class ProjetoYouTubeAula14Main {

	public static void main(String[] args) {

		Video v[] = new Video[3];

		v[0] = new Video("Aula 01 de POO");
		v[1] = new Video("Aula 12 de Php");
		v[2] = new Video("Aula 10 de html");

		v[0].setAvaliacao(5);

		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());

		Gafanhoto g[] = new Gafanhoto[2];

		g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
		g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");

		System.out.println("--------------------------------------");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		
		System.out.println("--------------------------------------");
		Visualizacao vis = new Visualizacao (g[0], v[2]);
		System.out.println(vis.toString());
		
		vis.avaliar(75.5);
		
		System.out.println(vis.getFilme());
		
	}

}
