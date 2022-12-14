package org.example;

import java.util.ArrayList;

public class Nutricionista {

	private String nome;
	private int calorias;
	private float peso;

	public Nutricionista(String nome) {
		this.nome = nome;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void calcularMetabolismoBasal(Pessoa aluno) {
		double Kcal = 0;
		//Homens
		if (aluno.getSexo() == 'm') {
			Kcal = 66 + (13.7 * aluno.getPeso()) + (5.0 * (aluno.getAltura() * 100)) - (6.8 * aluno.getIdade());

		}

		//Mulheres
		else {
			Kcal = 665 + (9.6 * aluno.getPeso()) + (1.8 * (aluno.getAltura() * 100)) - (4.7 * aluno.getIdade());

		}
		aluno.setTxMetabolicaBasal(Kcal);
	}
}

