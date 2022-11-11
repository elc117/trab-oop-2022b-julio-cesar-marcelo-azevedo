import java.util.ArrayList;

public class EscolaTest extends Escola {
	
	public EscolaTest(String nomeEscola, String nutricionistaResp) {
		super(nomeEscola, nutricionistaResp);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Escola e1 = new Escola("Margarida Lopes", "Ana Vitoria");
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno("Pedro", 14, 37f, 1.45f, true);
		
		
		
		listaAlunos.add(a1);
		listaAlunos.add(a2);
		
		System.out.println("Alunos sem dieta:");
		for(Aluno e: listaAlunos) {
			if(e.getDietaRestritiva() == false) {
				System.out.println(e.getInfoAluno());
			}
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("Alunos com dieta:");
		for(Aluno e: listaAlunos) {
			if(e.getDietaRestritiva() == true) {
				System.out.println(e.getInfoAluno());
			}
		
		}
		System.out.println("-------------------------------------------------------------");

		System.out.println("Total alunos dieta");
		
		
		
	}
}
