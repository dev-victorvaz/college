/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rascunho;
import java.util.Scanner;

/**
 *
 * @author victordeoliveira
 */
public class Rascunho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, teste = 100;
        Scanner entrada = new
                Scanner(System.in);
        boolean comparacao;
        System.out.println("Informe um número:");
        numero = entrada.nextInt();
        comparacao = (numero >= 4) || (numero < teste);
        System.out.println(comparacao);
    }
    
}
