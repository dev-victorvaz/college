package class8f_2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String food;
		People user = new People();
		Sergio serjao = new Sergio();
		
		System.out.println("What food you give to the people and to Sérgio?");
		food = read.nextLine();
		
		user.eat(food);
		serjao.eat(food);
	}

}
