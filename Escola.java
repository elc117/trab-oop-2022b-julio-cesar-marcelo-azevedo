import java.util.ArrayList;
import java.util.Scanner;

public class Escola extends Aluno{
	private String nome;
    private int totAlunos;
    private String tipoAlimento;
    private ArrayList<Escola> despensa;
    private ArrayList<Aluno> alunosGeral;
    private ArrayList<Aluno> alunosEspecificos;

    public Escola(String nome){
    	this.nome = nome;
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
    
    
    public void addDespensa(ArrayList<Escola> despensa) {
    	this.despensa.addAll(despensa);
    	
    }
    
    public static void main(String[] args) {
    	Escola e = new Escola("Margarida Lopes");
    	
    	ArrayList<Aluno> alunosGeral = new ArrayList<Aluno>();
    	ArrayList<Aluno> alunosEspecificos = new ArrayList<Aluno>();
    	
    	ArrayList<Escola> despensa = new ArrayList<Escola>();
    
    	
    	Aluno a1 = new Aluno("Joao", 12, 45f, 1.45f, false);
    	Aluno a2 = new Aluno("Nicolas", 13, 41f, 1.41f, false);
  
    	Aluno a3 = new Aluno("Paula", 14, 43f, 1.42f, true);
    	Aluno a4 = new Aluno("Pedro", 11, 40f, 1.47f, true);
    	        	
    	alunosGeral.add(a1);
    	alunosGeral.add(a2);
    	
    	alunosEspecificos.add(a3);
    	alunosEspecificos.add(a4);
    	
    	
    	
    	System.out.println("Lista alunos gerais: "); 
    	for (Aluno al : alunosGeral) {
    		
    		
    		System.out.println(al.getNome());

    	}
    		System.out.println("----------------------");
    	
    	System.out.println("Lista alunos especificos: ");
    	for (Aluno al : alunosEspecificos) {
    		
    		
    		
    		System.out.println(al.getNome());
    		

    	}
		System.out.println("----------------------");

    	
    }
}