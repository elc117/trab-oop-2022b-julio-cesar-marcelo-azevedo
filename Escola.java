public class Escola extends Aluno{
    private int totAlunos;
    private String nomeEscola;
    private List<Aluno> alunosGeral;
    private List<Aluno> alunosRestritos;


    public Escola(String nomeEscola, List<Aluno> alunos, List<Aluno> alunosRestritos){
        this.alunos = alunos;
        this.alunosRestritos = alunosRestritos;
        this.nomeEscola = nomeEscola;
    }

    public List<Aluno> getAlunosGeral(){
        return alunosGeral;
    }

    public List<Aluno> getAlunosRestritos(){
        return alunosRestritos;
    }

    public void setTotAlunos(int totAlunos){
        this.totAlunos = totAlunos;
    }

    public int getTotAlunos(){
        return this.alunos;
    }

    public void setNomeEscola(String nomeEscola){
        this.nomeEscola = nomeEscola;
    }
}