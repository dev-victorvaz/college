package question2;

public class People {
	String name, adress, office, number;
	
	public People(String nameAux, String adressAux, String officeAux, String numberAux) {
		name = nameAux;
		adress = adressAux;
		office = officeAux;
		number = numberAux;
	}
	
	public double Commission(int days) {
		return days * 1000;
	}
	
	public double Discount(double comission) {
		return comission * 0.88;
	}
}
