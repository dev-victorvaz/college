package aula6ex1_v1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Aula6Ex1_v1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double altura;
        String sexo;
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.println("Informe sua altura em metros:");
        altura = ler.nextDouble();
        System.out.println("Diga o seu sexo:");
        sexo = ler.next();
        
        if (PesoIdeal(altura, sexo) > 0)
            System.out.println("Seu peso ideal é: " + deci.format(PesoIdeal(altura, sexo)) + "kg.");
        else
            System.out.println("Erro.");
    }
    
    public static double PesoIdeal(Double altura, String sexo) {
        return switch (sexo) {
            case "masculino", "Masculino" -> 72 * altura - 58;
            case "feminino", "Feminino" -> 62.1 * altura - 44.7;
            default -> 0;
        };
    }
    
}
