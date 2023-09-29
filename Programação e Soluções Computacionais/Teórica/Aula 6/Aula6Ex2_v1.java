package aula6ex2_v1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Aula6Ex2_v1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double dinheiro;
        DecimalFormat deci = new DecimalFormat("0.00");
        String dinheiroDestino;
        
        System.out.println("Informe o valor de reais a ser convertido:");
        dinheiro = ler.nextDouble();
        System.out.println("Informe para qual moeda deseja que o valor seja convertido:\n Dólar.\n Euro.\n Libra.\n Peso.");
        dinheiroDestino = ler.next();
        
        if (Conversao(dinheiro, dinheiroDestino) > 0) {
            System.out.println(dinheiro + " reais equivale à " + deci.format(Conversao(dinheiro, dinheiroDestino)) + " " + dinheiroDestino + "s.");
        }
        else
            System.out.println("Erro.");
    }
    
    public static double Conversao(double dinheiro, String dinheiroDestino) {
        return switch (dinheiroDestino) {
            case "Dólar", "dólar" -> dinheiro / 4.71;
            case "Euro", "euro" -> dinheiro / 5.14;
            case "Libra", "libra" -> dinheiro / 6.16;
            case "Peso", "peso" -> dinheiro * 146.22;
            default -> 0;
        };
    }
    
}
