import java.util.ArrayList;
public class Nutricionista extends Pessoa{
	
	private String tipoDieta;
	private ArrayList<Pessoa> alunosGeral;
	private ArrayList<Pessoa> alunosDieta;
	
	public Nutricionista(String nome) {
		super(nome);
		this.alunosGeral = new ArrayList<Pessoa>();
		this.alunosDieta = new ArrayList<Pessoa>();

	}
	public void calcularMetabolismoBasal(Pessoa aluno){

		//Homens
		double X = 66 + (13.7 * aluno.getPeso()) + (5.0 * (aluno.getAltura()*100)) - (6.8 * aluno.getIdade());

		//Mulheres
		double Y = 665 + (9.6 * aluno.getPeso()) + (1.8 * (aluno.getAltura()*100)) - (4.7 * aluno.getIdade());
	}
}

