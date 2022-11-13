import java.util.ArrayList;

public class Despensa{
	
	private ArrayList<String> despensa = new ArrayList<String>();
	
	public Despensa() {
		this.despensa = despensa;
		despensa.add("Arroz branco");
		despensa.add("Feijao preto");
		despensa.add("Carne");
		despensa.add("Batata");
		despensa.add("Lentilha");
		despensa.add("Carne bovina");
		despensa.add("Peito de frango");
		despensa.add("Ovo cozido");
		
	}
	
	public void setDespensa(ArrayList<Despensa> alimentos) {
	}
   
	public ArrayList<String> getDespensa() {
		return despensa;
	}

	 public String getInfoDespensa() {
		    return "{" +
		      "class='Despensa'" +
		      ", nomeAlimento='" + getDespensa() + "'"
		      ;

		  }


}
