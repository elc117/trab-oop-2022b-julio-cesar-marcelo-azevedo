import java.util.ArrayList;

public class AlunoTest extends Aluno{

    public static void main(String[] args){
    	
    	ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        Aluno a1 = new Aluno("Joao", 12, 45.0f, 1.50f, false);
        Aluno a2 = new Aluno("Paula", 15, 43.0f, 1.450f, true);
        Aluno a3 = new Aluno ("Nicolas", 12, 41.0f, 1.55f, false);
        Aluno a4 = new Aluno ("Natalia", 13, 40.0f, 1.42f, true);
        
        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        listaAlunos.add(a4);
        
        
    }


}