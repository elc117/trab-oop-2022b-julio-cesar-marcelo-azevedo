import java.util.ArrayList;
import java.util.Scanner;

public class Escola extends Aluno{
	private String nome;
    private int totAlunos;
    private String tipoAlimento;
    private ArrayList<Escola> despensa;
    private ArrayList<Aluno> alunosGeral;
    //private ArrayList<AlunoEspecifico> alunosEspecificos;

    public Escola(){
    }
    
    public Escola(String name) {
    	this.nome = nome;
    	this.alunosGeral = new ArrayList<Aluno>();
    	//this.alunosEspecificos = new ArrayList<Aluno>();
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getNome() {
    	return this.nome;
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
    
    public void addAlunoGeral(Aluno alunoGeral) {
    	this.alunosGeral.add(alunoGeral);
    	
    }
    
    /*public void addAlunoEspecifico(Aluno alunoEspecifico) {
    	this.alunosEspecificos.add(alunoEspecifico);
    }
    
  	
    
    public ArrayList<String> getAlunosInfo(){
    	ArrayList<String> alunos = new ArrayList<String>();
    	
    	for (Aluno al: aluno) {
    		
    	}
    	return alunos;
    }
    */
}