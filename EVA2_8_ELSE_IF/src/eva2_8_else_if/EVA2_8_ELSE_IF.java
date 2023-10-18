/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_else_if;

import java.util.Scanner;

/* @author invitado
 */
public class EVA2_8_ELSE_IF {

    public static void main(String[] args) {
        // TODO code application logic here
        //solicitar el numero de mes
        
        int mes; 
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE EL NUMERO DEL MES");
        mes= input.nextInt();
        
        if(mes<=12 && mes>=1){
            //System.out.println("El numero " + mes + " es un mes valido");
            System.out.print("El mes que buscas es ");}
            if(mes==1) System.out.println("ENERO");
            else if(mes==2) System.out.println("FEBRERO");
            else if(mes==3) System.out.println("MARZO");
            else if(mes==4) System.out.println("ABRIL");
            else if(mes==5) System.out.println("MAYO");
            else if(mes==6) System.out.println("JUNIO");
            else if(mes==7) System.out.println("JULIO");
            else if(mes==8) System.out.println("AGOSTO");
            else if(mes==9) System.out.println("SEPTIEMBRE");
            else if(mes==10) System.out.println("OCTUBRE");
            else if(mes==11) System.out.println("NOVIEMBRE");
            else if(mes==12) System.out.println("DICIEMBRE");
            else   
                System.out.println("El numero " + mes + " no es valido");
            //DEJA DE TENER SENTIDO SI SE CAMBIA ALGUNA DE LAS VARIABLES A EVALUAR TIENE QUE SER EL MISMO OPERADOR
        //else System.out.println("NUMERO NO VALIDO");
        
        
    }
    
}
