package aula6ex3_v1;

import java.util.Scanner;

public class Aula6Ex3_v1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double pesoCao;
        int tipoCao;
        float idadeCao;
        
        System.out.println("Informe a idade de seu cão em anos:");
        idadeCao = ler.nextFloat();
        System.out.println("Informe o peso do seu cão em kg:");
        pesoCao = ler.nextDouble();
        
        tipoCao = TipoCao(pesoCao);
        
        if (IdadeHumana(tipoCao, idadeCao) > -1)
            System.out.println("A idade humana de seu cão é de " + IdadeHumana(tipoCao, idadeCao) + " anos.");
        else
            System.out.println("Erro.");
    }
    
    public static int TipoCao(double pesoCao) {
        if (pesoCao > 0 && pesoCao <= 3)
            // Porte pequeno
            return 0;
        else if (pesoCao > 3 && pesoCao <= 23)
            // Porte médio
            return 1;
        else if (pesoCao > 23)
            // Porte grande
            return 2;
        else
            return -1;
    }
    
    public static float IdadeHumana(int tipoCao, float idadeCao) {
        float idadeHumana = 0;
        
        if (idadeCao > 0) {
            switch (tipoCao) {
                case 0 -> {
                    // Tipo pequeno
                    if (idadeCao >= 2) {
                        idadeCao -= 2;
                        idadeHumana += 25;
                    }
                    else {
                        idadeHumana += 12.5 * idadeCao;
                        idadeCao -= idadeCao;
                    }   idadeHumana += idadeCao * 5.2;
                }
                case 1 -> {
                    // Tipo médio
                    if (idadeCao >= 2) {
                        idadeCao -= 2;
                        idadeHumana += 21;
                    }
                    else {
                        idadeHumana += 10.5 * idadeCao;
                        idadeCao -= idadeCao;
                    }   idadeHumana += idadeCao * 5.7;
                }
                case 2 -> {
                    // Tipo grande
                    if (idadeCao >= 2) {
                        idadeCao -= 2;
                        idadeHumana += 9;
                    }
                    else {
                        idadeHumana += 18 * idadeCao;
                        idadeCao -= idadeCao;
                    }   idadeHumana += idadeCao * 7.8;
                }
                default -> {
                        return -1;
                }
            }
        }
        else
            return -1;
        
        return idadeHumana;
    }
    
}
