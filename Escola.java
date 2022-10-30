import java.util.ArrayList;

public class Escola extends Aluno{
    private int totAlunos;
    private ArrayList<String> despensa;
    private ArrayList<String> alunos;

    public Escola(int totAlunos){
       this.totAlunos = totAlunos;
    }
    
    public void setDespensa(ArrayList<String> despensa){
		
		this.despensa = despensa;
        
    }
    
    public ArrayList<String> getDespensa(){
    	return this.despensa;
    }


    public void setTotAlunos(int totAlunos){
        this.totAlunos = totAlunos;
    }

    public int getTotAlunos(){
        return this.totAlunos;
    }    
}