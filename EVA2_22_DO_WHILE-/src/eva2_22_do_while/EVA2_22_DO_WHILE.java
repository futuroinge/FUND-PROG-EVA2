/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_22_do_while;

import java.util.Scanner;

/* @author invitado
 */
public class EVA2_22_DO_WHILE {
    final static String NOMBRE_USUARIO = "ADMIN";
    final static String PASSWORD = "ADMIN";
    
    public static void main(String[] args) {
        String usuario, pwd;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Introduce el usuario: ");
            usuario = input.nextLine();
            System.out.println("Introduce la contraseña: ");
            pwd = input.nextLine();
        } while(!usuario.equals(NOMBRE_USUARIO) || !PASSWORD.equals(pwd));
        
        //CON STRINGS USA EQUALS
        
        
    }
    
}
