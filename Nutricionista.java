import java.util.ArrayList;
import java.util.HashMap;

public class Nutricionista extends Despensa{
	
	/*
	 *  Para cada 1g de carboidratos, multiplicar por 4 calorias;
		Para cada 1g de proteína, multiplicar por 4 calorias;
		Para cada 1g de gordura, multiplicar por 9 calorias;
	 * 
	 */
	private String nome;
	private HashMap<String, Float> valorCarbo = new HashMap<String, Float>();
	private HashMap<String, Float> valorProt = new HashMap<String, Float>(); 
	private HashMap<String, Float> valorLip = new HashMap<String, Float>(); 


	
	public Nutricionista() {
		
		valorCarbo.put("Arroz branco", 25.8f);
		valorCarbo.put("Batata", 18.5f);
		valorCarbo.put("Lentilha", 16.3f);
		valorCarbo.put("Feijao preto", 14f);
		
		valorProt.put("Carne bovina", 278f);
		valorProt.put("Peito de frango", 159f);
		valorProt.put("Ovo cozido", 146f);

	}
	public HashMap<String, Float> getValorCarbo() {
		return valorCarbo;
	}
	
	public void setValorCarbo() {
		Despensa d = new Despensa();
		HashMap<String, Float> valorCarbo = new HashMap<String, Float>();
		for(String i : d.getDespensa().keySet()) {
			if(i.contains("Arroz Branco")) {
				valorCarbo.put(i, 400f);
			}
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	 public HashMap<String, Float> getValorLip() {
			return valorLip;
		}
		public void setValorProt(HashMap<String, Float> valorProt) {
			this.valorProt = valorProt;
		}
	 
		 public HashMap<String, Float> getValorProt() {
				return valorProt;
			}
			public void setValorLip(HashMap<String, Float> valorLip) {
				this.valorLip = valorLip;
			}
	
	public void criaDietaGeral(Despensa despensa) {
		Despensa d = new Despensa();
		
	}
		
	
	 public String getInfoCarbo() {
		    return "{" +
		      "class='Nutricionista'" +
		      ", valorCarbo='" + getValorCarbo() + "'";

		  }
	
	 public String getInfoProt() {
		    return "{" +
		      "class='Nutricionista'" +
		      ", valorProt='" + getValorProt() + "'";

		  }
	
	
	
}

