import java.util.ArrayList;

public class EscolaTest extends Escola{

	public static void main(String[] args) {
		Escola e1 = new Escola();
		ArrayList<String> despensa = new ArrayList<String>();
		
		despensa.add("Arroz integral");
        despensa.add("Feijao preto");
        despensa.add("Batata");
        despensa.add("Carne vermelha");
        despensa.add("Carne branca");
        despensa.add("Tomate");
        despensa.add("Beterraba");
        
        for(String i: despensa) {
        	System.out.println(i);
        }
	}

}
