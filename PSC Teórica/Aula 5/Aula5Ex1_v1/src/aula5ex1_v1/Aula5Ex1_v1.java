package aula5ex1_v1;

public class Aula5Ex1_v1 {

    public static void main(String[] args) {
        int x = 1, y = 1;
        
        while (x <= 10) {
            while (y <= 10) {
                System.out.println(x + " * " + y + " = " + (x * y));
                y++;
            }
            
            System.out.println("\n");
            
            y = 1;
            x++;
        }
    }
    
}
