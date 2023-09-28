package question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String name, adress, office, number;
		int days;
		
		System.out.println("What is you name?");
		name = read.next();
		System.out.println("What is you adress?");
		adress = read.next();
		System.out.println("What is you position in the company?");
		office = read.next();
		System.out.println("What is you phone number?");
		number = read.next();
		System.out.println("How many days did you work?");
		days = read.nextInt();
		
		People worker = new People(name, adress, office, number);
		
		System.out.println(worker.name + ", you comission is $" + worker.Commission(days) + " and you get $" + worker.Discount(worker.Commission(days)) + " off");
	}

}
