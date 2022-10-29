import java.util.ArrayList;

public class Escola extends Aluno{
    private int totAlunos;
    private String nomeEscola;
    private ArrayList<String> despensa = new ArrayList<String>();

    public Escola(){
       this.despensa = despensa;
       this.totAlunos = totAlunos;
       this.nomeEscola = nomeEscola;
    }
    
    public void setDespensa(ArrayList<String> despensa){
		
		despensa.add("Arroz integral");
        despensa.add("Feijao preto");
        despensa.add("Batata");
        despensa.add("Carne vermelha");
        despensa.add("Carne branca");
        despensa.add("Tomate");
        despensa.add("Beterraba");
        
    }
    
    public ArrayList<String> getDespensa(){
    	return despensa;
    }


    public void setTotAlunos(int totAlunos){
        this.totAlunos = totAlunos;
    }

    public int getTotAlunos(){
        return this.totAlunos;
    }

    public void setNomeEscola(String nomeEscola){
        this.nomeEscola = nomeEscola;
    }
    
    public String getNomeEscola() {
    	return nomeEscola;
    }
    
}