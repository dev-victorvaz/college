package class8f_1;

public class main {

	public static void main(String[] args) {
		System.out.println("Integer 2 squared: " + square(2));
		System.out.println("Double PI squared: " + square(Math.PI));
	}
	
	public static int square(int number) {
		return number * number;
	}
	
	public static double square(double number) {
		return number * number;
	}

}