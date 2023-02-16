package Aula11;

public class ProgramaPrincipalDaAula11 {

	public static void main(String[] args) {

		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(33);
		v1.setSexo("M");
		System.out.println(v1.toString());
		System.out.println("---------------------------------------------------");
		System.out.println("");
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudio");
		a1.setCurso("Informática");
		a1.setMatricula(111);
		a1.setIdade(16);
		a1.setSexo("M");
		System.out.println(a1.toString() + " Matricula: " + a1.getMatricula() + " Curso: " + a1.getCurso());
		a1.pagarMensalidade();
		System.out.println("---------------------------------------------------");
		System.out.println("");
		
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(2222);
		b1.setNome("Jubileu");
		b1.setBolsa(50);
		System.out.println(b1.toString());
		System.out.println("Matrícula : " + b1.getMatricula());
		System.out.println("Bolsa : " + b1.getBolsa());
		b1.pagarMensalidade();
		System.out.println("---------------------------------------------------");
		System.out.println("");
		
	}

}
