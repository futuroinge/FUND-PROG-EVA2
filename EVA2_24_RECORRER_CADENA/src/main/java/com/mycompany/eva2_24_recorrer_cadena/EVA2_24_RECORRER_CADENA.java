/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_24_recorrer_cadena;

import java.util.Scanner;

/**
 *
 * @author karlo
 */
public class EVA2_24_RECORRER_CADENA {

    public static void main(String[] args) {
    String cade;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        cade = input.nextLine();
        for( int i = 0 ; i < cade.length(); i++){
        char letra = cade.charAt(i);
        if(letra>='0'&&letra<='9' || letra== '.'){
            System.out.println("Char Invalid");
            break;
            }else System.out.println(cade.charAt(i));
        
        }    
    }
}
