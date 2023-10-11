/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_bisiesto_;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_BISIESTO_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int year, residuo;

        Scanner input = new Scanner(System.in);
        System.out.println("Captura el año");
        year = input.nextInt();
        residuo = year % 4;
        if (residuo == 0) {//divisible entre 4
            residuo = year % 100;
            if (residuo == 0) {
                residuo = year % 400;
                if (residuo == 0) {
                    System.out.println("BISIESTO");
                } else {
                    System.out.println("NO BISIESTO");
                }
            } else {
                System.out.println("BISIESTO");
            }
        } else {
            System.out.println("NO BISIESTO");
        }
    }
    
}
