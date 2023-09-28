/*
1) Faça um algoritmo que leia 5 números inteiro e armazene em um arraylist e 
mostre uma mensagem indicando se cada número é par ou ímpar, e se é positivo ou negativo.
*/

package class06ex1_v1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		int x = 0;
		
		System.out.println("Type the first number:");
		numberList.add(read.nextInt());
		System.out.println("Type the second number:");
		numberList.add(read.nextInt());
		System.out.println("Type the third number:");
		numberList.add(read.nextInt());
		System.out.println("Type the four number:");
		numberList.add(read.nextInt());
		System.out.println("Type the five number:");
		numberList.add(read.nextInt());
		
		while(x < numberList.size()) {
			System.out.printf("The number in position ");
			
			if(numberList.get(x) % 2 != 0)
				System.out.printf("is odd ");
			else
				System.out.printf("is par ");
			
			if (numberList.get(x) > 0)
				System.out.printf("and positive.");
			else if (numberList.get(x) == 0)
				System.out.printf("and neutral.");
			else
				System.out.printf("and negative.");
			
			System.out.printf("\n");
			
			x++;
		}
	}

}
