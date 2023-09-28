package a4e2v1;
import java.util.Scanner;

public class A4e2v1 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, i = 1, soma = 1, j, aux;
        
        System.out.println("Informe o valor N da P.A.:");
        n = ler.nextInt();
        
        for (i = n; i > 1; i--) {
            aux = i;
            
            for (j = i; j > 1; j--)
                aux *= i;
            
            soma = soma + aux;
        }
        
        System.out.println("O valor da P.A. é: " + soma);
    }
    
}
