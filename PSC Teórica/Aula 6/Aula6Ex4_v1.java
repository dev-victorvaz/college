package aula6ex4_v1;

import java.util.Scanner;

public class Aula6Ex4_v1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        
        System.out.println("Informe um número inteiro:");
        numero = ler.nextInt();
        
        System.out.println("O número informado é " + ImparOuPar(numero) +
                " e ele é " + PositivoOuNegativo(numero) + ".");
    }
    
    public static String ImparOuPar(int numero) {
        if (numero % 2 != 0)
            return "impar";
        else
            return "par";
    }
    
    public static String PositivoOuNegativo(int numero) {
        if (numero > 0)
            return "positivo";
        else
            return "negativo";
    }
    
}
