/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1v1;

import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author victor
 */
public class E1v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        // Declaração de dados
        double boleto1, boleto2, salarioBruto, salarioLiquido, disponivel;
        String nomeCredor, vencimentoTexto1, vencimentoTexto2, diaHoje;
        Date vencimento1, vencimento2, dia;
        
        // Criação do leitos de entrada de dados do teclado
        Scanner ler = new
            Scanner(System.in);
        
        // Entrada de dados
        System.out.println("Informe seu nome:");
        nomeCredor = ler.next();
        
        System.out.println("Informe seu salário bruto:");
        salarioBruto = ler.nextDouble();
        
        System.out.println("Informe o valor do primeiro boleto:");
        boleto1 = ler.nextDouble();
        System.out.println("Informe a data de vencimento do primeiro boleto:");
        vencimentoTexto1 = ler.next();
        
        System.out.println("Informe o valor do segundo boleto:");
        boleto2 = ler.nextDouble();
        System.out.println("Informe a data de vencimento do segundo boleto:");
        vencimentoTexto2 = ler.next();
        
        System.out.println("Informe a data de hoje:");
        diaHoje = ler.next();
        
        // Processamento de dados
        try {
            vencimento1 = sdf.parse(vencimentoTexto1);
            vencimento2 = sdf.parse(vencimentoTexto2);
            dia = sdf.parse(diaHoje);
        } catch (java.text.ParseException e) {
            return;
        }
        
        salarioLiquido = salarioBruto * 0.7;
        disponivel = salarioLiquido - boleto1 - boleto2;
        
        long difData1 = (vencimento1.getTime()-dia.getTime())/86400000;
        long difData2 = (vencimento2.getTime()-dia.getTime())/86400000;
        
        // Saída de dados
        System.out.println("Olá, " + nomeCredor + " seu salário líquido é de R$" + salarioLiquido + " e você terá R$"
                + disponivel + " disponíveis após os boletos serem pagos.\nAinda falta " + difData1 + " dias restantes"
                        + " para o vencimento do primeiro boleto e " + difData2 + " dias restantes para o"
                                + " vencimento do segundo boleto.");
    }
    
}
