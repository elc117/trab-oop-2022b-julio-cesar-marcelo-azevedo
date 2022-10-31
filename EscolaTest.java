import java.util.ArrayList;

public class EscolaTest extends Escola {

	
	public EscolaTest(int totAlunos) {
		super(totAlunos);
	}

	public static void main(String[] args) {
		Escola e1 = new Escola(4);
		
		ArrayList<String> despensa = new ArrayList();
		ArrayList<String> alunoGeral = new ArrayList<String>();
		ArrayList<String> alunoEspecifico = new ArrayList<String>();
		ArrayList<String> listaAlunos = new ArrayList<String>();
		
		System.out.println("Total alunos: " + e1.getTotAlunos());
		
		despensa.add("Arroz integral");
        despensa.add("Feijao preto");
        despensa.add("Batata");
        despensa.add("Carne vermelha");
        despensa.add("Carne branca");
        despensa.add("Tomate");
        despensa.add("Beterraba");
        
        Aluno a1 = new Aluno("Joao", 12, 45.0f, 1.50f, false);
        Aluno a2 = new Aluno("Paula", 15, 43.0f, 1.450f, true);
        Aluno a3 = new Aluno ("Nicolas", 12, 41.0f, 1.55f, false);
        Aluno a4 = new Aluno ("Natalia", 13, 40.0f, 1.42f, true);
        
        System.out.println(a1);
                
        
        //System.out.println(despensa);
	}

}
