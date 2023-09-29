/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2v1;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author 1221116101
 */
public class E2v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int altura, beleza, carisma;
        
        Scanner ler = new
            Scanner(System.in);
        
        System.out.println("Dê sua nota em altura:");
        altura = ler.nextInt();
        System.out.println("Dê sua nota em beleza:");
        beleza = ler.nextInt();
        System.out.println("Dê sua nota em carisma:");
        carisma = ler.nextInt();
        
        if (altura > 7 && beleza > 7 && carisma > 7){
            System.out.println("Boooora!");
        } else {
            if ((altura > 7 && beleza > 7) || (beleza > 7 && carisma > 7) || (carisma > 7 && beleza > 7)) {
                System.out.println("Só vai...");
            } else {
                if (altura > 7 || beleza > 7 || carisma > 7) {
                    System.out.println("Armor à Pátria...");
                }
            }
        }
    }
    
}
