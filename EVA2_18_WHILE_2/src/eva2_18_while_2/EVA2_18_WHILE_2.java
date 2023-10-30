/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_while_2;

import java.util.Scanner;

/* @author invitado
 */
public class EVA2_18_WHILE_2 {
    public static void main(String[] args) {
        int nume = 100;
        int captu = 0;
        Scanner input = new Scanner(System.in);
        
        while(nume !=captu){
            System.out.println("Adivina el numero");
            captu = input.nextInt();
            if(captu==nume)
                System.out.println("Adivinaste");
            
        }
    }
    
}
