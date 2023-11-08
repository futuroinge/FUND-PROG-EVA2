/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_28_uso_arreglos;

import java.util.Scanner;

/*@author CARLOSCERDA
 */
public class EVA2_28_USO_ARREGLOS {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int cant;
        int[] califas;//aqui el arreglo no existe
        System.out.println("Cuantas calificaciones quieres capturar?");
        cant= input.nextInt();
        
        califas = new int[cant];
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Captura calificaciones: ");
            califas[i]= input.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.print("[" + califas[i] + "]");
        }
        
        
    }
    
}
