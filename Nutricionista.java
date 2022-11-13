import java.util.ArrayList;
public class Nutricionista extends Despensa{
	
	private String nome;
	private ArrayList<String> listaCarbo = new ArrayList<String>();
	private ArrayList<String> listaProt = new ArrayList<String>();
	private ArrayList<String> dietaGeral1 = new ArrayList<String>();

	private ArrayList<String> dietaEspecial = new ArrayList<String>();

	
	public Nutricionista(Despensa d) {
		this.nome = "Ana";
		this.listaCarbo = listaCarbo;
		this.listaProt = listaProt;
		this.dietaGeral1 = dietaGeral1;
		this.dietaEspecial = dietaEspecial;
		this.setDietaGeral1(d);
		this.setDietaEspecial(d);
		listaCarbo.add("Arroz branco");
		listaCarbo.add("Batata");
		listaCarbo.add("Lentilha");
		listaCarbo.add("Feijao preto");
		
		listaProt.add("Carne bovina");
		listaProt.add("Peito de frango");
		listaProt.add("Ovo cozido");

	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDietaGeral1(Despensa despensa) {
		/*for(String i: despensa.getDespensa()) {
			if(despensa.getDespensa().contains("Arroz branco")) {
				dietaGeral1.add("Arroz branco");		
			}
			else if(despensa.getDespensa().contains("Feijao preto")) {
				dietaGeral1.add("Feijao preto");		
			}
		}*/
		
		for(String i: despensa.getDespensa()) {
			if(i.contentEquals("Arroz branco")) {
				dietaGeral1.add("Arroz branco");
				
			}
			if(i.contentEquals("Feijao preto")) {
				dietaGeral1.add("Feijao preto");
				
			}
			
			if(i.contentEquals("Peito de frango")) {
				dietaGeral1.add("Peito de frango");
				
			}
		}
		
	}
	
	public ArrayList<String> getDietaGeral1(){
		
		return dietaGeral1;
	}
	
	public void setListaCarbo() {
		
	}
	
	public ArrayList<String> getListaCarbo(){
		
		return listaCarbo;
	}
	
	public void setListaProt() {
		
	}
	
	public ArrayList<String> getListaProt(){
		
		return listaProt;
	}
	
	public void setDietaEspecial(Despensa despensa) {
		for(String i: despensa.getDespensa()) {
			if(i.contentEquals("Lentilha")) {
				dietaEspecial.add("Lentilha");
				
			}
			if(i.contentEquals("Batata")) {
				dietaEspecial.add("Batata");
				
			}
			
			if(i.contentEquals("Ovo cozido")) {
				dietaEspecial.add("Ovo cozido");
				
			}
		}
	}
	
	public ArrayList<String> getDietaEspecial(){
		
		return dietaEspecial;
	}
	
	public String getInfoNutricionista() {
	    return "{" +
	      "class='Nutricionista'" +
	      ", nome='" + getNome() + "'" +
	      ", listaCarbo='" + getListaCarbo() + "'" +
	      ", listaProt='" + getListaProt() + "'" +
	      ", dietaGeral'" + getDietaGeral1() + "'" +
	      ", dietaEspecial='" + getDietaEspecial() + "'" +
	      "}";
	  }
}

