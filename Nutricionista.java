import java.util.ArrayList;
import java.util.HashMap;

public class Nutricionista{
	
	/*
	 * Carboidrato: Arroz branco , feijão, lentilha, macarrão integral;
	 * Proteína: Carne vermelha, frango
	 * 
	 */
	private String nome;
	private String nomeEscola;
	private HashMap<String, Float> listaCarbo  = new HashMap<String, Float>();
	private HashMap<String, Float> listaProt  = new HashMap<String, Float>();
	
	public Nutricionista() {
		
	}
	public Nutricionista(String nome, String nomeEscola) {
		this.nome = nome;
		this.nomeEscola = nomeEscola;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public HashMap<String, Float> setValorEnergeticoCarboidrato() {
		//"Alimento, Valor energetico (kcal)"
		
		HashMap<String, Float> listaCarbo = new HashMap<String, Float>();
		listaCarbo.put("Arroz branco", 128.3f);
		listaCarbo.put("Feijao", 164f);
		listaCarbo.put("Lentilha", 128.3f);
		listaCarbo.put("Macarrao", 173.80f);
		return listaCarbo;
		
	}
	
	public HashMap<String, Float> getValorEnergeticoCarboidrato(String string){
		return listaCarbo;
		
	}
	
	public void setValorEnergeticoProteina() {
		//"Alimento, Valor energetico (kcal)"
		
		HashMap<String, Float> listaProt = new HashMap<String, Float>();
		listaProt.put("Frango", 163.0f);
		listaProt.put("Carne", 144f);
		listaProt.put("Peixe", 150.0f);
		listaProt.put("Ovos", 155.0f);
		
	}
	
	public static void main(String [] args) {
		
		
	}
}

