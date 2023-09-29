package aula5ex1_v1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Aula5Ex1_v1 {

    public static void main(String[] args) {
        double salario, imposto;
        Scanner ler = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.println("Digite seu salário:");
        salario = ler.nextDouble();
        
        imposto = CalculaImposto(salario);
        
        System.out.println("Você pagará em imposto: R$" + deci.format(imposto));
    }
    public static double CalculaImposto(Double x) {
        double desconto;
        
        desconto = x * 0.14;
        
        return desconto;
    }
    
}
