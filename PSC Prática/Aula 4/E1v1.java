/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1v1;
import java.util.Scanner;

/**
 *
 * @author victordeoliveira
 */
public class E1v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salarioBruto, salarioLiquido, boleto1, boleto2, boleto3, boleto4, disponivel;
        int caso;
        Scanner ler = new
                Scanner(System.in);
        
        System.out.println("Informe seu salário bruto:");
        salarioBruto = ler.nextDouble();
        System.out.println("Informe o valor do primeiro boleto:");
        boleto1 = ler.nextDouble();
        System.out.println("Informe o valor do segundo boleto:");
        boleto2 = ler.nextDouble();
        System.out.println("Informe o valor do terceiro boleto:");
        boleto3 = ler.nextDouble();
        System.out.println("Informe o valor do quarto boleto:");
        boleto4 = ler.nextDouble();
        
        salarioLiquido = salarioBruto * 0.815;
        disponivel = salarioLiquido - boleto1 - boleto2 - boleto3 - boleto4;
        
        if (disponivel > 0)
            caso = 3;
        else if (disponivel == 0)
            caso = 2;
        else
            caso = 1;
        
        switch (caso) {
            case 3:
                System.out.println("Envie R$" + disponivel + " para a poupança.");
                break;
            
            case 2:
                System.out.println("Não há dinheiro disponível para enviar para a poupança.");
                break;
            
            case 1:
                System.out.println("Está devendo R$" + disponivel + ".");
                break;
        }
    }
    
}
