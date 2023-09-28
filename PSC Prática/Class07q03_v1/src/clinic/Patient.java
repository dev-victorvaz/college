package clinic;

public class Patient {
	public String name;
	public String adress;
	public String cpf;
	public String identity;
	public double bodyMass;
	
	public Patient (String nameIn, String adressIn, String cpfIn, String identityIn, double bodyMassIn) {
		name = nameIn;
		adress = adressIn;
		cpf = cpfIn;
		identity = identityIn;
		bodyMass = bodyMassIn;
	}
}
