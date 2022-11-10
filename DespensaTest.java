import java.util.ArrayList;

public class DespensaTest extends Despensa {
	
	public DespensaTest(String nomeEscola, String nutricionistaResp, ArrayList<Aluno> listaAlunos) {
		super(nomeEscola, nutricionistaResp, listaAlunos);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	//Despensa d = new Despensa(nomeAlimento, nomeAlimento, null);
	ArrayList<String> listaAlimentos = new ArrayList<String>();
	
	listaAlimentos.add("Arroz integral");
	listaAlimentos.add("Feijao preto");
	listaAlimentos.add("Batata");
	listaAlimentos.add("Carne vermelha");
	listaAlimentos.add("Carne branca");
	listaAlimentos.add("Tomate");
	listaAlimentos.add("Beterraba");
	
		//System.out.println(listaAlimentos.getInfoDespensa());
    

	}
}
