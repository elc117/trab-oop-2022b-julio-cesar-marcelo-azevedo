import java.util.ArrayList;

public class Escola extends Aluno{
	private String nomeEscola;
    private int totAlunos;
    private int totAlunosGeral;
    private int totAlunosDieta;
    private String nutricionistaResp;
    
    public Escola(String nomeEscola, String nutricionistaResp) {
    	this.nomeEscola = nomeEscola;
    	this.setNutricionistaResp(nutricionistaResp);
    	
    }
    
    public Escola(ArrayList<Aluno> listaAlunos){
    	this.setTotAlunos(listaAlunos);
    	
    }
    
    public void setNomeEscola(String nomeEscola) {
    	this.nomeEscola = nomeEscola;
    }
    
    public String getNomeEscola() {
    	return this.nomeEscola;
    }
    
    public void setTotAlunos(ArrayList<Aluno> listaAlunos) {
    	
    }
    
    public int getTotAlunos() {
    	
    	return this.totAlunos;
    }
    
    public void setTotAlunosGeral(ArrayList<Aluno> listaAlunos) {
    	
    }
    
    public int getTotAlunosGeral() {
    	return this.totAlunosGeral;
    }
    

	public String getNutricionistaResp() {
		return nutricionistaResp;
	}

	public void setNutricionistaResp(String nutricionistaResp) {
		this.nutricionistaResp = nutricionistaResp;
	}

	public int getTotAlunosDieta() {
		return totAlunosDieta;
	}

	public void setTotAlunosDieta(int totAlunosDieta) {
		this.totAlunosDieta = totAlunosDieta;
	}
    
}