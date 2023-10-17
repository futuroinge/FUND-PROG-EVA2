/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 * @author invitado
 */
public class EVA2_6_AND_OR_OPERADORES {

    public static void main(String[] args) {
        //capturar calificacion
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("Captura tu calificacion");
        califa = input.nextInt();

        //se recomienda poner las dos expresiones entre parentesis para mayor claridad
        if (califa <= 100 && califa >= 0) {
            System.out.println("La calificacion " + califa + " es valida");
            if(califa>=70)
                System.out.println("Acreditado");
            else
                System.out.println("No acreditado");
        } else {
            System.out.println("VALOR NO VALIDO");
        }
        //una sola instruccion no lleva llaves
    }

}
