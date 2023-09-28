package a4e1v1;
import java.util.Scanner;


public class A4e1v1 {


    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        int kills, deaths, assists;
        String vencedor = "n";
        
        while(vencedor.equals("n")) {
            System.out.println("Número de kills:");
            kills = ler.nextInt();
            System.out.println("Número de Deaths:");
            deaths = ler.nextInt();
            System.out.println("Número de Assists:");
            assists = ler.nextInt();
            
            if (kills <= 5)
                System.out.println("Noob.");
            if (kills >= 20)
                System.out.println("Master.");
            if (deaths >= 20)
                System.out.println("Houston, we have a problem.");
            if (assists >= 20)
                System.out.println("Team Work!");
            
            System.out.println("Já foi decidido um vencedor?\n (s) para sim e parar.\n (n) para não e continuar.");
            vencedor = ler.next();
        }
    }
    
}
