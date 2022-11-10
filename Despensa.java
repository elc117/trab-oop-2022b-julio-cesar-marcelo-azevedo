import java.util.ArrayList;
import java.util.HashMap;

public class Despensa{
	
	public Despensa() {
		despensa.put("Arroz Branco", 5f);
		despensa.put("Feijao", 3f);
		despensa.put("Carne", 10f);
		
		
	}
	
	private HashMap<String, Float> despensa = new HashMap<String, Float>();
    
	public void setDespensa(HashMap<String, Float> alimentos) {
	}
   
	public HashMap<String, Float> getDespensa() {
		return despensa;
	}

	 public String getInfoDespensa() {
		    return "{" +
		      "class='Despensa'" +
		      ", nomeAlimento='" + getDespensa() + "'" +
		      ",";

		  }


}
