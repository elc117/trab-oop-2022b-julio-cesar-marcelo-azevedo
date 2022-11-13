
public class NutricionistaTest extends Nutricionista{
	
	
	public NutricionistaTest(Despensa d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Despensa d = new Despensa();

		Nutricionista n = new Nutricionista(d);
		System.out.println(n.getInfoNutricionista());
		
	}
}
