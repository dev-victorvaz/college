package clinic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Procedure {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date dateBr = null;
	String description;
	double value;
	double pay;
	
	public Procedure (String descriptionIn, Date dateIn, double valueIn) {
		dateBr = dateIn;
		description = descriptionIn;
		value = valueIn;
	}
	
	public double Rate (int quantity) {
		this.pay = value * quantity;
		return pay;
	}
}
