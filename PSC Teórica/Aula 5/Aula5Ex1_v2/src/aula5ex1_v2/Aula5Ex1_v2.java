package aula5ex1_v2;

public class Aula5Ex1_v2 {

    public static void main(String[] args) {
        int x = 1, y = 1;
        int vetorMulti[] = new int[10];
        
        while (x <= 10) {
            while (y <= 10) {
                //System.out.println(x + " * " + y + " = " + (x * y));
                
                if (x == 1) {
                    vetorMulti[y - 1] = x * y;
                    System.out.println(vetorMulti[y - 1]);
                }
                
                y++;
            }
            
            //System.out.println("\n");
            
            y = 1;
            x++;
        }
    }
    
}
