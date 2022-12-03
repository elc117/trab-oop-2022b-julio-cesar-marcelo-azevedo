import java.util.ArrayList;
public class Nutricionista extends Pessoa{
	
	private double IMC;
	private String tipoDieta;
	private ArrayList<Pessoa> alunosGeral;
	private ArrayList<Pessoa> alunosDieta;
	private ArrayList<String> listaCarbo = new ArrayList<String>();
	private ArrayList<String> listaProt = new ArrayList<String>();
	private ArrayList<String> dietaGeral = new ArrayList<String>();
	private ArrayList<String> dietaEspecial = new ArrayList<String>();

	
	public Nutricionista(String nome) {
		super(nome);
		this.alunosGeral = new ArrayList<Pessoa>();
		this.alunosDieta = new ArrayList<Pessoa>();

	}
	
	
	/*public ArrayList<Pessoa> getIMC() {
		ArrayList<Pessoa> listaAlunos = new ArrayList<Pessoa>();
		for(Pessoa a: alunosGeral) {
			IMC = Math.floor(a.getPeso() /(a.getAltura() * a.getAltura()));
			
			if(IMC <=16.2f || IMC <24.6f) {
				alunosGeral.add(a.setTipoDieta("Normal"));
			}
			else if (IMC <16.2f) {
				alunosGeral.add(a.setTipoDieta("Magreza"));
			}
			
			else if (IMC <=24.6f || IMC <29.3f) {
				alunosGeral.add(a.setTipoDieta("Sobrepeso"));
			}
			else {
				alunosGeral.add(a.setTipoDieta("Obesidade"));
			}
			
			}
			
			return listaAlunos;	
	}
	
	*/
		
	
	public ArrayList<String> getDietaGeral1(){
		
		return dietaGeral;
	}
	
	public void setListaCarbo() {
		listaCarbo.add("Arroz branco");
		listaCarbo.add("Batata");
		listaCarbo.add("Lentilha");
		listaCarbo.add("Feijao preto");
	}
	
	public ArrayList<String> getListaCarbo(){
		
		return listaCarbo;
	}
	
	public void setListaProt() {
		listaProt.add("Carne bovina");
		listaProt.add("Peito de frango");
		listaProt.add("Ovo cozido");
	}
	
	public ArrayList<String> getListaProt(){
		
		return listaProt;
	}
	
	
	public ArrayList<String> getDietaEspecial(){
		
		return dietaEspecial;
	}
	
	public String getInfoNutricionista() {
	    return "{" +
	      "class='Nutricionista'" +
	      ", nome='" + getNome() + "'" +
	      ", listaAlunosGeral='" + getListaCarbo() + "'" +
	      ", listaProt='" + getListaProt() + "'" +
	      ", dietaGeral'" + getDietaGeral1() + "'" +
	      ", dietaEspecial='" + getDietaEspecial() + "'" +
	      "}";
	  }
}

