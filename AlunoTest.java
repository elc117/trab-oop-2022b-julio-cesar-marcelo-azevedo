public class AlunoTest extends Aluno{

    public static void main(String[] args){

        Aluno a1 = new Aluno();

        a1.setNome("Pedro");
        a1.setIdade(12);
        a1.setPeso(45);
        a1.setAltura(1.45);

        System.out.println("Nome: ", a1.getNome());
    }


}