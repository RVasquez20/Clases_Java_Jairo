// Ejercicio 8: Realice un programa donde se puedan ingresar n cantidad de estudiantes con 3 notas cada estudiante y al 
//finalizar mostrar el estudiante con mayor y menor promedio

package Ejercicio_8;

import java.util.*;

public class Estudiantes {

    public static void main(String[] args) {
        int contador = 0;
        String confirmacion = "";
        String nombres = "";
        
        Scanner entrada = new Scanner(System.in);
        
        Queue<String> estudiante = new LinkedList<>();
        int[] notas = new int[3];
        
        do{
            contador++;
            System.out.println("Ingrese un nombre y un apellido del estudiante: ");
            nombres = entrada.nextLine();
            estudiante.add(nombres);
            
            for (int i=0; i<notas.length; i++) {
                System.out.println("Ingrese una nota ");
                notas[i] = entrada.nextInt();
            }
            entrada.nextLine();
            
            System.out.println("Desea ingresar otro estudiante? [S/N]: ");
            confirmacion = entrada.nextLine();
        }while(confirmacion.toUpperCase().equals("S"));
        
        
        for (int i=0; i<notas.length; i++) {
            System.out.println(estudiante);
            System.out.println(notas[i]);
            
        }
    }    
}