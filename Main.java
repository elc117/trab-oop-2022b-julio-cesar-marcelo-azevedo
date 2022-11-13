import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Despensa d = new Despensa();
		Nutricionista n = new Nutricionista(d);
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Escola e1 = new Escola("Margarida Lopes", n.getNome());

		Aluno a1 = new Aluno("Joao", 12, 61f, 1.54f, true);
		
		Aluno a2 = new Aluno("Pedro", 14, 60f, 1.63f, false);
		
		Aluno a3 = new Aluno("Ana", 16, 63f, 1.50f, true);
		
		Aluno a4 = new Aluno("Vitoria", 13, 47f, 1.60f, false);
		
		listaAlunos.add(a1);
		listaAlunos.add(a2);
		listaAlunos.add(a3);
		listaAlunos.add(a4);
		
		System.out.println("Escola: " + e1.getNomeEscola() + ", "+ "Nutricionista responsavel: " + e1.getNutricionistaResp());
		System.out.println("Despensa: " + d.getInfoDespensa());
		System.out.println("Alunos sem dieta:");
		for(Aluno e: listaAlunos) {
			if(e.getDietaRestritiva() == false) {
				System.out.println(e.getInfoAluno());
			}
		}
		System.out.println("Dieta recomendada: "+ n.getDietaGeral1());
		System.out.println();
		System.out.println("Alunos com dieta:");
		for(Aluno e: listaAlunos) {
			if(e.getDietaRestritiva() == true) {
				System.out.println(e.getInfoAluno());
			}
		
		}
		System.out.println("Dieta recomendada: "+ n.getDietaEspecial());

			
	}
	
}
