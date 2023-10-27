/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_factorial;

import java.util.Scanner;

/*@author invitado
 */
public class EVA2_16_FACTORIAL {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("En que numero piensas");
        num = input.nextInt();
        int resultado=0;
       // int i=num; i>=1; i--
        // int i=num; i>=1; i--
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " x ");
            
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial= factorial*i;
        }
        System.out.println(" ");
        System.out.println("Factorial de "+ num+  " es = "+ factorial);
        
        
        
        
        
    }
    
}
