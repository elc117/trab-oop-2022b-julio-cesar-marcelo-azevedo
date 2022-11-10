import java.util.ArrayList;

public class DespensaTest extends Despensa {
	
	public static void main(String[] args) {
	Despensa d = new Despensa();
	ArrayList<String> listaAlimentos = new ArrayList<String>();
	
	listaAlimentos.add("Arroz integral");
	listaAlimentos.add("Feijao preto");
	listaAlimentos.add("Batata");
	listaAlimentos.add("Carne vermelha");
	listaAlimentos.add("Carne branca");
	listaAlimentos.add("Tomate");
	listaAlimentos.add("Beterraba");
	
	System.out.println(d.getInfoDespensa());
    

	}
}
