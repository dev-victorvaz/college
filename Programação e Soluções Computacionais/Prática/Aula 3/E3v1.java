/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e3v1;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author 1221116101
 */
public class E3v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salarioBruto, salarioLiquido, boleto1, boleto2, boleto3, boleto4, salarioDisponivel;
        Scanner ler = new
            Scanner(System.in);
        
        System.out.println("Informe seu salário bruto:");
        salarioBruto = ler.nextDouble();
        System.out.println("informe o valor do primeiro boleto:");
        boleto1 = ler.nextDouble();
        System.out.println("informe o valor do segundo boleto:");
        boleto2 = ler.nextDouble();
        System.out.println("informe o valor do terceiro boleto:");
        boleto3 = ler.nextDouble();
        System.out.println("informe o valor do quarto boleto:");
        boleto4 = ler.nextDouble();
        
        salarioLiquido = salarioBruto * 0.815;
        salarioDisponivel = salarioLiquido - boleto1 - boleto2 - boleto3 - boleto4;
        
        if (salarioDisponivel > 0) {
            System.out.println("Você irá enviar R$" + salarioDisponivel + " para a poupança.");
        } else {
            if (salarioDisponivel == 0) {
                System.out.println("Você não tem dinheiro para enviar para a poupança.");
            } else {
                System.out.println("Deu ruim.");
            }
        }
        
    }
    
}
