import java.util.ArrayList;

public class Aluno{
    private String nomeAluno;
    private int idade;
    private float peso;
    private float altura;
    private boolean dietaRestrita;
    private String tipoDieta;
    

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
    this.setTipoDieta(dietaRestrita);
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

public void setDietaRestritiva(boolean dietaRestrita) {
	this.dietaRestrita = dietaRestrita;
}

public boolean getDietaRestritiva() {
	return this.dietaRestrita;
}

public void setTipoDieta(boolean dieta) {
	if (this.dietaRestrita == true) {
		this.tipoDieta = "Obesidade";
	}
	else {
		this.tipoDieta = "Normal";
	}
}


public String getTipoDieta() {
	return tipoDieta;
}

public String getInfoAluno() {
    return "{" +
      "class='Aluno'" +
      ", nome='" + getNome() + "'" +
      ", idade='" + getIdade() + "'" +
      ", peso='" + getPeso() + "'" +
      ", altura='" + getAltura() + "'" +
      ", dietaRestritiva='" + getDietaRestritiva() + "'" + 
      ", tipoDieta='" + getTipoDieta() + "'" +
      "}";
  }


}