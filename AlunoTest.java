public class AlunoTest extends Aluno{

    public static void main(String[] args){

        Aluno a1 = new Aluno();

        a1.setNome("Pedro");
        a1.setIdade(12);
        a1.setPeso(45);
        a1.setAltura(1.45f);
        
        Aluno a2 = new Aluno();
        
        System.out.println("------------------------------");
        System.out.println("Nome: " + a2.getNome());
        System.out.println("Idade: " + a2.getIdade());
        System.out.println("Peso: " + a2.getPeso());
        System.out.println("Altura: " + a2.getAltura());

        System.out.println("------------------------------");
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Peso: " + a1.getPeso());
        System.out.println("Altura: " + a1.getAltura());
        System.out.println("------------------------------");

    }


}