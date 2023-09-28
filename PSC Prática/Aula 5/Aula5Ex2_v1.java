package aula5ex2_v1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Aula5Ex2_v1 {

    public static void main(String[] args) {
        double salario;
        Scanner ler = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        for(int i = 1; i <= 12; i++) {
            System.out.println("Digite seu salário no " + i + "º mês.");
            salario = ler.nextDouble();
            
            System.out.println("Você pagará R$" + deci.format(CalculaImposto(salario, 0.03)) + " do imposto INSS no " + i + "º mês.");
            System.out.println("Você pagará R$" + deci.format(CalculaImposto(salario, 0.025)) + " do imposto Simples no " + i + "º mês.");
            System.out.println("Você pagará R$" + deci.format(CalculaImposto(salario, 0.0145)) + " do imposto CREA no " + i + "º mês.");
            System.out.println("Você pagará R$" + deci.format(CalculaImposto(salario, 0.02)) + " do imposto ICMS no " + i + "º mês.");
            System.out.println("Você pagará R$" + deci.format(CalculaImposto(salario, 0.0167)) + " do imposto ISS no " + i + "º mês.");
        }
    }
    public static double CalculaImposto(Double x, Double y) {
        double desconto;
        
        desconto = x * y;
        
        return desconto;
    }
    
}
