/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_31_uso_arreglos_2;

import java.util.Scanner;

/*@author CCERDA
 */
public class EVA2_31_USO_ARREGLOS_2 {
    public static void main(String[] args) {
        //GENERAR UN ARREGLO TAMAÑO 15
        //LLENARLO DE VALORES ALEATORIOS: 0-99
        int[] arreglo = new int[15];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        Scanner input = new Scanner (System.in);
        System.out.println("");
        System.out.println("Que valor necesitas: ");
        int valor = input.nextInt();
        int sloth = -1;
        
        for (int i = 0; i < arreglo.length; i++) {
            if ( valor == arreglo[i]) {
                System.out.println("Posicion " + arreglo[i]);
                sloth =i;
                break;
            }
        }
        if(sloth == -1){System.out.println("No esta");}    
    }
    
}
