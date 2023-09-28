package class8f_2;

public class People {
	String name;
	int age;
	
	public void setName(String nameIn) {
		this.name = nameIn;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int ageIn) {
		this.age = ageIn;
	}
	
	public int getAge() {
		return age;
	}
	
	public People() {
		
	}
	
	public void eat(String food) {
		System.out.println("People eating " + food);
	}
}
