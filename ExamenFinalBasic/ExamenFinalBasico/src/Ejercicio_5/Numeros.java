// Ejercicio 5: Solicitar 3 numero al usuario almacenarlos en un array  y ordenarlos de mayor a menor y viceversa y mostrarlos.

package Ejercicio_5;

import java.util.*;

public class Numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numero = new int[3];
        
        for (int i=0; i<numero.length; i++) {
            System.out.println("Ingrese un numero: ");
            numero[i] = entrada.nextInt();
        }
        
        Arrays.sort(numero);
        
        System.out.println("Ordenado de menor a mayor");
        for (int i=0; i<numero.length; i++) {
            System.out.println(numero[i]);
            
        }
        
        System.out.println("\n\nOdernados de mayor a menor");
        for (int i=numero.length-1; i>=0; i--) {
            System.out.println(numero[i]);
        }
    }
}