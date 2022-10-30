import java.util.ArrayList;

public class EscolaTest extends Escola {

	
	public EscolaTest(int totAlunos) {
		super(totAlunos);
	}

	public static void main(String[] args) {
		Escola e1 = new Escola(50);
		
		ArrayList<String> despensa = new ArrayList();
		System.out.println("Total alunos: " + e1.getTotAlunos());
		
		despensa.add("Arroz integral");
        despensa.add("Feijao preto");
        despensa.add("Batata");
        despensa.add("Carne vermelha");
        despensa.add("Carne branca");
        despensa.add("Tomate");
        despensa.add("Beterraba");
        	
        System.out.println(despensa);
	}

}
