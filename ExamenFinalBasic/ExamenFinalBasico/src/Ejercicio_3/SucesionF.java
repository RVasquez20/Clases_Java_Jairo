// Ejercicio 3: Relizar un programa que encuentra la sucesion de fibonaci, por medio de recursividad

package Ejercicio_3;

import java.util.*;

public class SucesionF {

    public static void main(String[] args) {
        int cantidad = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de elemos a mostrar: ");
        cantidad = entrada.nextInt();
        entrada.nextLine();
        
        for (int i=0; i<cantidad; i++) {
            System.out.print(fFibo(i) + ", ");
        }
        System.out.println("\n");
    }
    
    public static int fFibo(int numero) {
        if(numero == 0 || numero == 1){
            return numero;
        }else{
            return fFibo(numero-1) + fFibo(numero-2);
        }
    }
}