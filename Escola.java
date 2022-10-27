
public class Escola {
	private int totAlunos;
	private String tipoDieta;
	
	public Escola() {
		this.totAlunos = 100;
		this.tipoDieta = "padrão";
		
	}
	
	public void setTotAlunos(int totAlunos) {
		this.totAlunos = totAlunos;
	}
	
	public int getTotAlunos() {
		return this.totAlunos;
	}
	
	public void setTipoDieta(String tipoDieta) {
		this.tipoDieta = tipoDieta;
	}
	
	public String getTipoDieta() {
		return this.tipoDieta;
	}
	
}
