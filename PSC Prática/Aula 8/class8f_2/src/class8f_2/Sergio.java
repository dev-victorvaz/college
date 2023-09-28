package class8f_2;

public class Sergio extends People {
	@Override
	
	public void eat (String food) {
		if (food.equals("fish"))
			System.out.println("Sérgio don't like fish. He don't go eat.");
		else
			System.out.println("Let's go eat " + food + ".");
	}
}
