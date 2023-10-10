/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF_2 {

    public static void main(String[] args) {
        // TCTRL+SHIFT+FLECHA_INF
        
        int valor1, valor2;
        Scanner input = new Scanner(System.in);
        System.out.println("CAPTURAR PRIMER VALOR");
        valor1= input.nextInt();
        System.out.println("CAPTURAR SEGUNDO VALOR");
        valor2= input.nextInt();
        
        
        if(valor1>valor2) //verdad siempre obligatorio
            System.out.println("EL VALOR MAS GRANDE ES "+ valor1);
        else{//cuando el resultado es falso
            if(valor1==valor2)
                System.out.println("AMBOS VALORES SON IGUALES");
            else
                System.out.println("EL VALOR MAS GRANDE ES "+ valor2);
        }
        
        
        
    }
    
}
