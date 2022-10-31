import java.util.ArrayList;
import java.util.Scanner;

public class Escola extends Aluno{
    private int totAlunos;
    private String tipoAlimento;
    private ArrayList<Escola> despensa;
    private ArrayList<Aluno> alunos;

    public Escola(int totAlunos){
       this.totAlunos = totAlunos;
    }
    
    public void setDespensa(ArrayList<Escola> despensa){
		
		this.despensa = despensa;
        
    }
    
    public ArrayList<Escola> getDespensa(){
    	return this.despensa;
    }


    public void setTotAlunos(int totAlunos){
        this.totAlunos = totAlunos;
    }

    public int getTotAlunos(){
        return this.totAlunos;
    }
    
    public void setNovoAluno(ArrayList<Aluno> al) {
    	ArrayList<Aluno> alunos = new ArrayList<>();
        	
    	

    }
}