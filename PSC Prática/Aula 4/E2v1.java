/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2v1;
import java.util.Scanner;

/**
 *
 * @author victordeoliveira
 */
public class E2v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salarioFixo, salarioVendas, salarioTotal, valorTotal;
        int carrosVendidos;
        Scanner ler = new
            Scanner(System.in);
        
        System.out.println("Informe a quantidade de carros vendidos por você:");
        carrosVendidos = ler.nextInt();
        System.out.println("Informe o valor total de suas vendas:");
        valorTotal = ler.nextDouble();
        System.out.println("Informe o seu salário:");
        salarioFixo = ler.nextDouble();
    }
    
}
