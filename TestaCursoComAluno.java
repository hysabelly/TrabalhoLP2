
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Coleções java","Professor LP2");

		Aluno a1 = new Aluno("Vieira Tomioka", 34672);
		Aluno a2 = new Aluno("Cristinne Paula", 5617);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);

		System.out.println("Todos os alunos matriculados: ");

		Set<Aluno> alunos = javaColecoes.getAlunos();

		Iterator<Aluno> iterador = alunos.iterator();

		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}

		Vector<Aluno> vetor = new Vector<>();

		System.out.println("A aluna " + a1.getNome() + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));

		Aluno vieira = new Aluno("Vieira Tomioka", 34672);
		System.out.println("E essa Vieira, está matriculada?");
		System.out.println(javaColecoes.estaMatriculado(vieira));

		System.out.println("O a1 é equals a Vieira?");
		System.out.println(a1.equals(vieira));


		System.out.println(a1.hashCode() == vieira.hashCode());

	}
}
