package aula6ex5_v1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Aula6Ex5_v1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        double dinheiro;
        
        System.out.println("Informe o salário a ser calculado:");
        dinheiro = ler.nextDouble();
        
        if (ReajusteSalarial(dinheiro) != -1)
            System.out.println("O novo valor do salário informado é de R$" +
                    deci.format(ReajusteSalarial(dinheiro)) + ".");
        else
            System.out.println("Erro 0.");
    }
    
    public static double ReajusteSalarial(double dinheiro) {
        if (dinheiro > 0 && dinheiro <= 1000)
            return dinheiro * 1.2;
        else if (dinheiro > 1000 && dinheiro <= 2000)
            return dinheiro * 1.18;
        else if (dinheiro > 2000 && dinheiro <= 4000)
            return dinheiro * 1.15;
        else if (dinheiro > 4000)
            return dinheiro * 1.1;
        else
            return -1;
    }
    
}
