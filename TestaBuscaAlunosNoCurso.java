package br.com.alura;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Coleções java",
				"Professor LP2");


		Aluno a1 = new Aluno("Vieira Tomioka", 34672);
		Aluno a2 = new Aluno("Cristinne Paula", 5617);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		
		System.out.println("Quem é o aluno com matricula 5617?");
		
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("aluno: " + aluno);
	}
}
