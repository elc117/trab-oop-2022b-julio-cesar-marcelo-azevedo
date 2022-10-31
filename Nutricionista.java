import java.util.ArrayList;
public class Nutricionista extends Aluno{
	
	/*
	 Para cada 1g de carboidratos, multiplicar por 4 calorias;
	 Para cada 1g de proteína, multiplicar por 4 calorias;
     Para cada 1g de gordura, multiplicar por 9 calorias. 
	 */
	private String nome;
	private ArrayList<Escola> DietaGeral  = new ArrayList<Escola>();
	private ArrayList<Escola> DietaEspecial = new ArrayList<Escola>();
	
	public Nutricionista(String nome) {
		this.nome = "Ana";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	public void criaDietaGeral(int totAlunos) {
		Aluno al = new Aluno();
		// BEE : Gasto energetico basal
	
		//Crianças e adolescentes com peso normal (Meninos)
		//BEE_MENINOS = 68 – (43,3 x idade [anos]) + (712 x altura [m]) + (19,2 x peso [kg]);
		double BEE_MENINOS = 68 - (43.3 * al.getIdade() + (712 * al.getAltura() + (19.2 * al.getPeso()))) ;
		
		//Crianças e adolescentes com peso normal (Meninas)
		//BEEMENINAS = 189 – (17,6 x idade [anos]) + (625 x altura [m]) + (7,9 x peso [kg]);

	}
	
	public void criaDietaEspecifica(int totAlunos) {
		//Adolescentes com sobrepeso e obesidade (Homens)
		//BEE-HOMENS = 419,9 – (35,5 x idade [anos]) + (418,9 x altura [m]) + (16,7 x peso [kg]);
				
		//Adolescentes com sobrepeso e obesidade (Mulheres)
		//BEE-MULHERES = 515,8 – (26,8 x idade [anos]) + (347 x altura [m]) + (12,4 x peso [kg]);
	}
	
	
	
	public void editaDieta() {
		
	}
	
	public void excluiDieta() {
		
	}
	
	public void enviaDieta() {
		
	}
	
}

