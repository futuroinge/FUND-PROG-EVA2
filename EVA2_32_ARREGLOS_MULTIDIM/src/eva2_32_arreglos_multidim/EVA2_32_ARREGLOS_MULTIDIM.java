/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_32_arreglos_multidim;

/*
@author CARLOSCE
 */
public class EVA2_32_ARREGLOS_MULTIDIM {
    public static void main(String[] args) {
        //UN ARREGLO DE 2 DIMENSIONES ES UNA MATRIZ
        //SE ACCEDEN A LOS DATOS EN COORDENADAS(TIPO EXCELL) de izq a de3recha
        int [][] matriz = new int[3][4];
        matriz[1][3] = 100;
        System.out.println("matriz(1,3) =" + matriz[1][3]);
        //System.out.println(matriz.length);
        //----------------------
        //lenar valores aleatorios la matriz:
        //filas = primer dimension
        for (int i = 0; i < matriz.length; i++){
            //por cada fila debo reccorrer otra columna 
            //columnas
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= (int)(Math.random()*100);
            }
        }
        for (int i = 0; i < matriz.length; i++){
            //por cada fila debo reccorrer otra columna 
            //columnas
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" +matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        
        
        
        
        
    }
    
}
