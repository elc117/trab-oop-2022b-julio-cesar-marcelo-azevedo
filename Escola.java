import java.util.ArrayList;

public class Escola{
	private String nomeEscola;
    private String nutricionistaResp;
	private ArrayList<Pessoa> alunos;

    public Escola() {
    	
    }
    
    public Escola(String nomeEscola) {
    	this.nomeEscola = nomeEscola;
    	this.alunos = new ArrayList<Pessoa>();
    	
    }
    
    public void setNomeEscola(String nomeEscola) {
    	this.nomeEscola = nomeEscola;
    }
    
    public String getNomeEscola() {
    	return this.nomeEscola;
    }
    
    
	public String getNutricionistaResp() {
		return nutricionistaResp;
	}

	public void setNutricionistaResp(String nutricionistaResp) {
		this.nutricionistaResp = nutricionistaResp;
	}
	
	public void setAddAluno(Pessoa p) {
		this.alunos.add(p);	
	}
	
	public ArrayList<String> getListaAluno(){
		ArrayList<String> listaAlunos = new ArrayList<String>();
			for(Pessoa a: alunos) {
				listaAlunos.add(a.getInfoPessoa());
			}
		return listaAlunos;
	}
}
