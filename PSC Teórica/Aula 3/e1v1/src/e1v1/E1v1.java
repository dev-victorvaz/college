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
        String nomeProduto;
        int quantidadeProduto;
        double precoProduto, total;
        Scanner ler = new
            Scanner(System.in);
        
        System.out.println("Informe o nome do produto:");
        nomeProduto = ler.next();
        System.out.println("Informe o preço unitário:");
        precoProduto = ler.nextDouble();
        System.out.println("Informe a quantidade adquirida:");
        quantidadeProduto = ler.nextInt();
        
        total = quantidadeProduto * precoProduto;
        
        if (quantidadeProduto == 1) {
            total *= 0.98;
            System.out.println("O valor total de " + quantidadeProduto + " produto de " + nomeProduto + " a ser pago com desconto de 2% é R$" + total + " reais.");
        }
        else if (quantidadeProduto > 1 && quantidadeProduto <= 5) {
            total *= 0.98;
            System.out.println("O valor total de " + quantidadeProduto + " produtos de " + nomeProduto + " a ser pago com desconto de 2% é R$" + total + " reais.");
        }
        else if (quantidadeProduto > 5 && quantidadeProduto <= 10) {
            total *= 0.97;
            System.out.println("O valor total de " + quantidadeProduto + " produtos de " + nomeProduto + " a ser pago com desconto de 3% é R$" + total + " reais.");
        }
        else if (quantidadeProduto > 10 && quantidadeProduto < 30) {
            total *= 0.95;
            System.out.println("O valor total de " + quantidadeProduto + " produtos de " + nomeProduto + " a ser pago com desconto de 5% é R$" + total + " reais.");
        }
        else if (quantidadeProduto >= 30) {
            total *= 0.9;
            System.out.println("O valor total de " + quantidadeProduto + " produtos de " + nomeProduto + " a ser pago com desconto de 10% é R$" + total + " reais.");
        }
        else
            System.out.println("Nenhuma quantidade do produto " + nomeProduto + " foi comprada.");
    }
    
}
