package Aula10;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();

		p1.setNome("Pedro");
		p1.setIdade(33);
		p1.setSexo("M");

		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");

		p4.setSetor("Fábrica");

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString() + "Setor = " + p4.getSetor());
		
		System.out.println("");

		System.out.print(p3.getNome() + " : ");
		p3.fazerAniv();

		p3.setSalario(500.50);
		System.out.println(p3.getSalario());

		p3.setSalario(100);
		System.out.println(p3.getSalario());

	}

}
