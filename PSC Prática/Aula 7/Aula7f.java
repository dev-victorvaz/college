package Aula7f;

import java.util.Scanner;

public class Aula7f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.println("Informe o valor 1:");
		valor1 = ler.nextInt();
		System.out.println("Informe o valor 2:");
		valor2 = ler.nextInt();
		
		PrimeiraClasse calculo = new PrimeiraClasse(valor1, valor2);
		
		int soma = calculo.Soma();
		System.out.println("Soma: " + soma);
		int subt = calculo.Subt();
		System.out.println("Subtração: " + subt);
		int mult = calculo.Mult();
		System.out.println("Multiplicação: " + mult);
		int divs = calculo.Divs();
		System.out.println("Divisão: " + divs);
	}

}
