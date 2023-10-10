/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_num_pares;

import java.util.Scanner;

public class EVA2_3_NUM_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, residuo;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero");
        num = input.nextInt();
        residuo = num % 2;
        
        if(residuo == 1) 
            System.out.println("El numero es impar");
        else System.out.println("El numero es par");
        
    }
    
}
