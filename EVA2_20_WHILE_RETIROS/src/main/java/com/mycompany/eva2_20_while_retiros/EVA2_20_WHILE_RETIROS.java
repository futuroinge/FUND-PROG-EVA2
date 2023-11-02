/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_while_retiros;

import java.util.Scanner;

/*@author carloscerda
 */
public class EVA2_20_WHILE_RETIROS {

    public static void main(String[] args) {
        int canti = 1000;
        Scanner input = new Scanner(System.in);
        
        while(canti>0){
            System.out.println("¿Cuanto desas retirar?");
            int retiro = input.nextInt();
            canti -= retiro; //igual a canti= canti-retiro
            System.out.println("Te quedan $" + canti + " de saldo");}
            
            
    }
}
