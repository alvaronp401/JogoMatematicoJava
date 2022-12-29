package view;

import java.util.Scanner;

import main.Calculos;

public class Jogo {
	static Scanner input = new Scanner(System.in);
	static int pontos = 0;
	static Calculos calculos;

	public static void main(String[] args) {
		Jogo.play();
	}

	public static void play() {
		System.out.println("Informe o nivel de dificuldade desejado[1 ou 2]: ");
		int nivel = Jogo.input.nextInt();

		Jogo.calculos = new Calculos(nivel);

		// Soma
		System.out.println("Informe o resultado para a seguinte operacao: ");
		if (calculos.getOperacao() == 0) {
			System.out.println(calculos.getValor1() + " + " + calculos.getValor2());
			int resposta = Jogo.input.nextInt(); // esse nextInt é o numero que o usuario vai digitar

			if (calculos.somar(resposta)) {
				Jogo.pontos++;
				System.out.println("Voce tem " + Jogo.pontos + " ponto(s).");
			}
		}

		// Subtrair
		if (calculos.getOperacao() == 1) {
			System.out.println(calculos.getValor1() + " - " + calculos.getValor2());
			int resposta = Jogo.input.nextInt(); // esse nextInt é o numero que o usuario vai digitar

			if (calculos.subtrair(resposta)) {
				Jogo.pontos++;
				System.out.println("Voce tem " + Jogo.pontos + " ponto(s).");
			}
		}

		// Multiplicar
		if (calculos.getOperacao() == 2) {
			System.out.println(calculos.getValor1() + " * " + calculos.getValor2());
			int resposta = Jogo.input.nextInt(); // esse nextInt é o numero que o usuario vai digitar

			if (calculos.multiplicar(resposta)) {
				Jogo.pontos++;
				System.out.println("Voce tem " + Jogo.pontos + " ponto(s).");
			}
		}else {
			System.out.println("A operacao " + calculos.getOperacao() + " nao e reconhecida");
		}

		// Dividir
		if (calculos.getOperacao() == 3) {
			System.out.println(calculos.getValor1() + " / " + calculos.getValor2());
			int resposta = Jogo.input.nextInt(); // esse nextInt é o numero que o usuario vai digitar

			if (calculos.dividir(resposta)) {
				Jogo.pontos++;
				System.out.println("Voce tem " + Jogo.pontos + " ponto(s).");
			}
		}
		
		System.out.println("Deseja continuar? [1 - sim, 0 - nao]");
		int continuar = Jogo.input.nextInt();
		
		if(continuar == 1) {
			Jogo.play();
		} else {
			System.out.println("Voce fez " + Jogo.pontos + " ponto(s)");
			System.out.println("Até a proxima!");
			System.exit(0);
		}
	}
}
