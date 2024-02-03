/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundoprograma;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Segundoprograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome.");
        String name = leitura.nextLine(); 
        System.out.println("Digite sua nota.");
        float nota = leitura.nextFloat();
        
        System.out.printf("A nota de %s eh %.2f! \n", name, nota);
    }
    
}
