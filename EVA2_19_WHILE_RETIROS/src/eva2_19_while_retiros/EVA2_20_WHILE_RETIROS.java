/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_while_retiros;

import java.util.Scanner;

/*@author invitado
 */
public class EVA2_20_WHILE_RETIROS {
    public static void main(String[] args) {
        int canti = 1000;
        Scanner input = new Scanner(System.in);
        
        while(canti>0){
            System.out.println("¿Cuanto desas retirar?");
            int retiro = input.nextInt();
            canti -= retiro; //igual a canti= canti-retiro
            System.out.println("Te quedan $" + canti + " de saldo");
        }
    }
}