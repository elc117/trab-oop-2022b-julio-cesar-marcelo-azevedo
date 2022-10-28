public class Aluno{
    private String nomeAluno;
    private int idade;
    private float peso;
    private float altura;
    private boolean dietaRestrita;

public Aluno(){
    this.nomeAluno = "Joao";
    this.idade = 12;
    this.peso = 45;
    this.altura = 1.57f;
    this.dietaRestrita = false;
}

public Aluno(String nomeAluno, int idade, float peso, float altura, boolean dietaRestrita){
    this.nomeAluno = nomeAluno;
    this.idade = idade;
    this.peso = peso;
    this. altura = altura;
    this.dietaRestrita = dietaRestrita;
}

public void setNome(String nomeAluno){
    this.nomeAluno = nomeAluno;
}

public String getNome(){
    return this.nomeAluno;
}

public void setPeso(float peso){
    this.peso = peso;
}

public float getPeso(){
    return this.peso;
}

public void setAltura(float altura){
    this.altura = altura;
}

public float getAltura(){
    return this.altura;
}

public void setIdade(int idade){
    this.idade = idade;
}

public int getIdade(){
    return this.idade;
}

}