
public class AlunoTest extends Aluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Joao", 12, 54f, 1.54f, true);
		
		Aluno a2 = new Aluno("Pedro", 14, 40f, 1.60f, false);
		
		System.out.println(a1.getInfoAluno());
		System.out.println(a2.getInfoAluno());


	}

}
