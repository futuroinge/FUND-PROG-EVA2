/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_validar_do_while;

import java.util.Scanner;

/*@author carlosce
 */
public class EVA2_23_VALIDAR_DO_WHILE {

    final static String NOMBRE_USUARIO = "ADMIN";
    final static String PASSWORD = "ADMIN";

    public static void main(String[] args) {
        String usuario, pwd;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Introduce el usuario: ");
            usuario = input.nextLine();
            System.out.println("Introduce la contraseña: ");
            pwd = input.nextLine();
            boolean snake = false;
            for (int i = 0; i < usuario.length(); i++) {
                char letra = usuario.charAt(i);
                if (letra >= '0' && letra <= '9') {
                    //System.out.println("Char Invalid");
                    snake = true;
                    break;
                }//else System.out.println(cade.charAt(i));
            }
                if (!snake) {
                    for (int x = 0; x < pwd.length(); x++) {
                        char letra2 = pwd.charAt(x);
                        if (letra2 >= '0' && letra2 <= '9' ) {
                            snake = true;
                            break;
                        }
                    }
                }
                if (snake) {
                    System.out.println("Char Invalid");
                    break;
                }
            }
            while (!usuario.equals(NOMBRE_USUARIO) || !PASSWORD.equals(pwd));
            //CON STRINGS USA EQUALS
        }
    }
