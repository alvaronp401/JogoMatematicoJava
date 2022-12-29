package main;

import java.util.Random;

public class Calculos {
	private int nivel;
	private int valor1;
	private int valor2;
	private int operacao;
	private int result;

	// constructor
	public Calculos(int nivel) { // vai determinar quais numeros serao escolhidos
		Random random = new Random(); // classe do java.util
		this.operacao = random.nextInt(4); // 0-somar, 1-subtrair, 2-multiplicar, 3-dividir	// aleatoriamente
		this.nivel = nivel;

		if (nivel == 1) {
			// easy
			this.valor1 = random.nextInt(10); // pegar um valor de 0-10
			this.valor2 = random.nextInt(10);
		} else {
			this.valor1 = random.nextInt(100);
			this.valor2 = random.nextInt(100); // 0 - 100
		}
	}

	// getters
	public int getNivel() {
		return nivel;
	}

	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getOperacao() {
		return operacao;
	}

	public int getResult() {
		return result;
	}

	public String toString() {

		String opcao;
		if (this.getOperacao() == 0) {
			opcao = "Somar";
		} else if (this.getOperacao() == 1) {
			opcao = "Subtrair";
		} else if (this.getOperacao() == 2) {
			opcao = "Multiplicar";
		} else if (this.getOperacao() == 3) {
			opcao = "Dividir";
		} else {
			return "numero invalido";
		}

		return "Valor1: " + this.getValor1() + "\nValor2: " + this.getValor2() + "\nOperacao: " + opcao
				+ "\nDificuldade: " + this.getNivel();

	}

	public boolean somar(int valor) {
		this.result = this.getValor1() + this.getValor2();
		boolean acerto = false; // padrao

		if (valor == this.getResult()) {
			System.out.println("Resposta correta");
			acerto = true;
		} else {
			System.out.println("Resposta incorreta");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResult());
		return acerto;
	}

	public boolean subtrair(int valor) {
		this.result = this.getValor1() - this.getValor2();
		boolean acerto = false;

		if (valor == this.getResult()) {
			System.out.println("Resposta correta");
			acerto = true;
		} else {
			System.out.println("Resposta incorreta");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResult());
		return acerto;
	}

	public boolean multiplicar(int valor) {
		this.result = this.getValor1() * this.getValor2();
		boolean acerto = false;
		
		if(valor == this.getResult()) {
			System.out.println("Resposta correta");
			acerto = true;
		} else {
			System.out.println("Resposta incorreta");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResult());
		return acerto;
	}
	
	public boolean dividir(int valor) {
		this.result = this.getValor1() / this.getValor2();
		boolean acerto = false;
		
		if(valor == this.getResult()) {
			System.out.println("Resposta correta");
			acerto = true;
		}else {
			System.out.println("Resposta incorreta");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResult());
		return acerto;
	}
}
