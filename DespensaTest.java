import java.util.ArrayList;
import java.util.HashMap;

public class DespensaTest extends Despensa {
	
	public DespensaTest(String nomeEscola, String nutricionistaResp) {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		HashMap<String, Float> alimentos = new HashMap<String, Float>();
		Escola e = new Escola("Margarida Lopes", "Ana");
		Despensa d = new Despensa();
		
		System.out.println(d.getInfoDespensa());
		
	}
}
