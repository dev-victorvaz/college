package Aula7f;

public class PrimeiraClasse {
	boolean ClassLegal = true;
	
	int Arg1 = 0;
	int Arg2 = 0;
	
	public PrimeiraClasse(int num1, int num2) {
		Arg1 = num1;
		Arg2 = num2;
	}
	
	public int CodigoDaClasse() {
		return 1234;
	}
	
	public int Soma() {
		return Arg1 + Arg2;
	}
	
	public int Mult() {
		return Arg1 * Arg2;
	}
	
	public int Divs() {
		return Arg1 / Arg2;
	}
	
	public int Subt() {
		return Arg1 - Arg2;
	}
}
