package org.example;

import java.util.ArrayList;
public class Nutricionista extends Pessoa{
	
	private String tipoDieta;
	private ArrayList<Pessoa> calculoMetabolico;

	public Nutricionista(String nome) {
		super(nome);
		this.calculoMetabolico = new ArrayList<Pessoa>();
	}

	public void calcularMetabolismoBasal(Pessoa aluno){
		double Kcal=0;
		//Homens
		if(aluno.getSexo()=='m') {
			Kcal= 66 + (13.7 * aluno.getPeso()) + (5.0 * (aluno.getAltura()*100)) - (6.8 * aluno.getIdade());

		}

		//Mulheres
		else {
			Kcal = 665 + (9.6 * aluno.getPeso()) + (1.8 * (aluno.getAltura() * 100)) - (4.7 * aluno.getIdade());

		}
			aluno.setTxMetabolicaBasal(Kcal);
	}
}

