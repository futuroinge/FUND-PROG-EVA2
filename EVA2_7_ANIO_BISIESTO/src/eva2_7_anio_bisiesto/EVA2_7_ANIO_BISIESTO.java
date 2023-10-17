/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_7_ANIO_BISIESTO {

    public static void main(String[] args) {
       int year, resi4, resi100, resi400;

        Scanner input = new Scanner(System.in);
        System.out.println("Captura el año");
        year = input.nextInt();
        resi4 = year % 4;
        resi100 = year %100;
        resi400= year%400;
        // && operador and
        // || operador or 
        // ! operador not
        // operador != diferente de 
        if(resi4 == 0 || (resi100!=0 && resi400==0)) {
            System.out.println("El año " + year + " es bisiesto");
        } else 
            System.out.println("El año " + year + " NO es bisiesto");
        
        
        
            }
}  


