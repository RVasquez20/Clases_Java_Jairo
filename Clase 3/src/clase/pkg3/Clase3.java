/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg3;

import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Arreglos bidimensionales
       //Rellenarlos automaticamente y aleatoriamente
       int[][] numeros1={{3,2,1},{4,6,5},{9,0,7}};
       /*
       3|2|1
       4|6|5
       9|0|7
       */
       
       int[][] numeros2=new int[3][3];
       Random numRandom=new Random();//Random solo obtiene valores decimales
       //Desde el 0.0 al 1.0->0.123456,0.876543
       int Filas=numeros2[0].length;
       int Columnas=numeros2.length;
        for (int i = 0; i < Filas ; i++) {
            for (int j = 0; j < Columnas; j++) {
                numeros2[i][j]=(int)(numRandom.nextDouble()*1000.0);//0.123456->1.23456->12.3456
            }
        }
        for (int i = 0; i < Filas ; i++) {
            for (int j = 0; j < Columnas; j++) {
                System.out.print(numeros2[i][j]+"|");
            }
            System.out.println("");
        }
        //ArrayList->Stack
    }
    
}
