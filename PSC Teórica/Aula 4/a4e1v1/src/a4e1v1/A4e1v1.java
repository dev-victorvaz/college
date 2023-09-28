package a4e1v1;
import java.util.Scanner;

public class A4e1v1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float salarioVendedor = 1200, salarioCaixa = 1800, salarioGerente = 2500;
        int produto;
        String parada = "Sim";
        
        while (parada.equals("Sim")) {
            System.out.println("Qual produto foi vendido?\n (1) Produto 1.\n (2) Produto 2.\n (3) Produto 3.");
            produto = ler.nextInt();
            
            switch (produto) {
                case 1:
                    salarioVendedor += 20.90 * 0.03;
                    salarioCaixa += 20.90 * 0.005;
                    salarioGerente += 20.90 * 0.01;
                    break;
                
                case 2:
                    salarioVendedor += 59.90 * 0.04;
                    salarioCaixa += 59.90 * 0.01;
                    salarioGerente += 59.90 * 0.015;
                    break;
                    
                case 3:
                    salarioVendedor += 99.90 * 0.05;
                    salarioCaixa += 99.90 * 0.015;
                    salarioGerente += 99.90 * 0.02;
                    break;
            }
            
            System.out.println("Mais produto foram vendido?\n (Sim) para continuar.\n (Não) para parar.");
            parada = ler.next();
        }
        
        System.out.println("O salário do vendedor é de R$" + salarioVendedor + ".");
        System.out.println("O salário do caixa é de R$" + salarioCaixa + ".");
        System.out.println("O salário do gerente é de R$" + salarioGerente + ".");
    }
    
}
