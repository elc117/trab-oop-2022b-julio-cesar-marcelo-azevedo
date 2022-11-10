import java.util.ArrayList;

public class Despensa extends Escola {
	private ArrayList<Escola> despensa;
    private String nomeAlimento;
    private float qtdAlimento;
    
    public Despensa() {
    	
    }
    
   
	public ArrayList<Escola> getDespensa() {
		return despensa;
	}

	public void setDespensa(ArrayList<Escola> despensa) {
		this.despensa = despensa;
	}

	public float getQtdAlimento() {
		return qtdAlimento;
	}

	public void setQtdAlimento(float qtdAlimento) {
		this.qtdAlimento = qtdAlimento;
	}

	public String getNomeAlimento() {
		return nomeAlimento;
	}

	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}
	
	 public String getInfoDespensa() {
		    return "{" +
		      "class='Despensa'" +
		      ", nomeAlimento='" + getNomeAlimento() + "'" +
		      ", idade='" + getQtdAlimento() + "'";

		  }


}
