import java.util.ArrayList;

public class Despensa extends Escola {
	

	public Despensa(String nomeEscola, String nutricionistaResp, ArrayList<Aluno> listaAlunos) {
		super(nomeEscola, nutricionistaResp, listaAlunos);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Escola> despensa;
    private String nomeAlimento;
    private float qtdAlimento;
    
    
   
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
