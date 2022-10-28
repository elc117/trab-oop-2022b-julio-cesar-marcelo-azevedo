public class Escola extends Aluno{
    private int totAlunos;
    private String nomeEscola;

    public Escola(){
        
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
}