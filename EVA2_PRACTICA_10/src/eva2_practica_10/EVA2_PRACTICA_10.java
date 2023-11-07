/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_practica_10;

import java.util.Scanner;

/* @author CARLOSCERDA
 */
public class EVA2_PRACTICA_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String info;
        boolean snake = false;
        //hay una serpiente en mi bota 

        
        do{
        System.out.println("Ingresa informacion(numeros unicamente): "); 
        info = input.nextLine();
            for (int i = 0; i < info.length(); i++) {
                char letra = info.charAt(i);
                if (!(letra >= '0' && letra <= '9')) {
                    //System.out.println("Char Invalid");
                    snake = true;
                    break;
                }//else System.out.println(cade.charAt(i));
            }
                if (snake) {
                    System.out.println("Char Invalid, vuelve mas tarde");
                    break;
                }
            }
            while (!snake);

        
               
        
    }
    
}
