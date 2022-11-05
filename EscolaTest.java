import java.util.ArrayList;

public class EscolaTest extends Escola {
	
	public EscolaTest(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Escola e1 = new Escola("Margarida Lopes");
		
		ArrayList<String> despensa = new ArrayList<>();
		ArrayList<Aluno> alunoGeral = new ArrayList<Aluno>();
		ArrayList<Aluno> alunoEspecifico = new ArrayList<Aluno>();
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		System.out.println("Total alunos: " + e1.getTotAlunos());
		
		despensa.add("Arroz integral");
        despensa.add("Feijao preto");
        despensa.add("Batata");
        despensa.add("Carne vermelha");
        despensa.add("Carne branca");
        despensa.add("Tomate");
        despensa.add("Beterraba");
        
        
        //System.out.println(despensa);
        
        for(String item: despensa) {
        	System.out.println(despensa);
        }
	}

}
