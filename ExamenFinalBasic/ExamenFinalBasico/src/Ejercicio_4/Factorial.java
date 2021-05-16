// Ejercicio 4: Que encuentre el factorial de un numero dado por el usuario.

package Ejercicio_4;

import java.util.*;

public class Factorial {
        static int numero = 0;
        static int facotiral = 0;
        static Scanner entrada = new Scanner(System.in);
        
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();
        
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));

    }
    
    public static int factorial(int num) {
        
        if(num == 0){
            return 1;
        }else{
            return num * factorial(num - 1);
        }
    }
    
}
