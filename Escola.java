import java.util.ArrayList;
import java.util.Scanner;

public class Escola extends Aluno{
	private String nome;
    private int totAlunosGeral;
    private int totAlunosDieta;
    private ArrayList<Aluno> listaAlunos;

    public Escola() {
    	
    }
    
    public Escola(String nome){
    	this.nome = nome;
    	
    }
    
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getNome() {
    	return this.nome;
    }


	public int getTotAlunosGeral() {
		return totAlunosGeral;
	}

	public void setTotAlunosGeral(int totAlunosGeral) {
		this.totAlunosGeral = totAlunosGeral;
	}

	public ArrayList<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

	public int getTotAlunosDieta() {
		return totAlunosDieta;
	}

	public void setTotAlunosDieta(int totAlunosDieta) {
		this.totAlunosDieta = totAlunosDieta;
	}

}