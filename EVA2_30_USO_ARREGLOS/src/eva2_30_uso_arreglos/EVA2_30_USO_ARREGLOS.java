/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_30_uso_arreglos;

import java.util.Scanner;

/* @author CCERDA
 */
public class EVA2_30_USO_ARREGLOS {
    public static void main(String[] args) {
        String[] listas = new String[10];
        listas[0] = "Tacos";
        listas[1] = "Tamal";
        listas[2] = "tlacoyona";
        listas[3] = "Tlampiqueñas";
        listas[4] = "Tortas ahogadas";
        listas[5] = "Trex";
        listas[6] = "T-bone";
        listas[7] = "Tripas";
        
        double[] list$ = {20,30,40,50,60,70,80,80,90};
        
        System.out.println("-------------Menu-------------");
        for (int i = 0; i < 8; i++) {
            System.out.println( i + "- " + listas[i] + " :& " + list$[i]);
        }
        
        Scanner input = new Scanner (System.in);
        int opc, cant;
        System.out.println("Que se te antoja? ");
        opc = input.nextInt();
        System.out.println("Cuantas ordenes? ");
        cant = input.nextInt();
        System.out.println("Tu tptañ es de $: " + (cant * list$[opc]) );
    
    
    }
    
}
