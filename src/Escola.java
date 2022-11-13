import java.util.ArrayList;

public class Escola extends Aluno{
	private String nomeEscola;
    private String nutricionistaResp;
    
    public Escola() {
    	
    }
    public Escola(String nomeEscola, String nutricionistaResp) {
    	this.nomeEscola = nomeEscola;
    	this.setNutricionistaResp(nutricionistaResp);
    	
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

    
}