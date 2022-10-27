
public class Escola {
	private String nome;
	private String turno;
	private int totAlunos;
	private boolean nutricionista;
	private boolean dietaRestritiva;
	private String tipoDieta;
	
	public Escola() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public String getTurno() {
		return this.turno;
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
