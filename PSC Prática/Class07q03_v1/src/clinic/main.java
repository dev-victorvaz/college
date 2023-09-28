package clinic;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String name, adress, cpf, identity, crm, contact, description, dateAux;
		double bodyMass, value,rate;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dateBr = null;
		int quantity;
		
		System.out.println("About medic?:\nType medic name:");
		name = read.next();
		System.out.println("Type CRM:");
		crm = read.next();
		System.out.println("Type medic contact:");
		contact = read.next();
		
		Medic userMedic = new Medic(name, crm, contact);
		
		System.out.println("About patient:\nType patiente name:");
		name = read.next();
		System.out.println("Type patient adress:");
		adress = read.next();
		System.out.println("Type patient CPF:");
		cpf = read.next();
		System.out.println("Type patient identity");
		identity = read.next();
		System.out.println("Type patient body mass (kg):");
		bodyMass = read.nextDouble();
		
		Patient userPatient = new Patient(name, adress, cpf, identity, bodyMass);
		
		System.out.println("About procedure:\nType description:");
		description = read.next();
		System.out.println("Type date:");
		dateAux = read.next();
		try {
			dateBr = sdf.parse(dateAux);
		} catch	(java.text.ParseException e) {
			return;
		}
		System.out.println("Type the value:");
		value = read.nextDouble();
		
		Procedure proc = new Procedure(description, dateBr, value);
		
		System.out.println("Type the quantity of procedures:");
		quantity = read.nextInt();
		rate = proc.Rate(quantity);
		System.out.println("Rate: " + rate + " dolars.");
	}

}
