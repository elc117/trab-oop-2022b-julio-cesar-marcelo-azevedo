import java.util.ArrayList;
public class Nutricionista extends Escola {
	
	/*
	 Para cada 1g de carboidratos, multiplicar por 4 calorias;
	 Para cada 1g de proteína, multiplicar por 4 calorias;
     Para cada 1g de gordura, multiplicar por 9 calorias. 
	 */
	private String nome;
	private ArrayList<Escola> DietaGeral  = new ArrayList<Escola>();
	private ArrayList<Escola> DietaEspecial = new ArrayList<Escola>();
	
	public Nutricionista() {
		this.nome = "Ana";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	public void criaDieta() {
		
	}
	
	public void editaDieta() {
		
	}
	
	public void excluiDieta() {
		
	}
	
	public void enviaDieta() {
		
	}
	
}

