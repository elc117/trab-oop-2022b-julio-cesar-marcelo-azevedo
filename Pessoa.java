import java.util.ArrayList;

public class Pessoa{
    private char sexo;
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    private String tipoDieta;

public Pessoa(String nome){
    this.nome = nome;
}

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Pessoa(String nome, char sexo, int idade, float peso, float altura, boolean dietaRestrita){
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this. altura = altura;
    this.sexo = sexo;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;
}


private void setPeso(float peso){
    this.peso = peso;
}

public float getPeso(){
    return this.peso;
}

private void setAltura(float altura){
    this.altura = altura;
}

public float getAltura(){
    return this.altura;
}

private  void setIdade(int idade){
    this.idade = idade;
}

public int getIdade(){
    return this.idade;
}

public String getInfoPessoa() {
    return "{" +
      "class='Pessoa'" +
      ", nome='" + getNome() + "'" + "," +
            "Sexo='" + getSexo() + "'" +

            ", idade='" + getIdade() + "'" +
      ", peso='" + getPeso() + "'" +
      ", altura='" + getAltura() + "'" + 
      "}";
  }

public void setTipoDieta(String tipo) {
	this.tipoDieta = tipo;
}
public String getTipoDieta() {
	return tipoDieta;
}


}

