// Ejercicio 2: Realizar un menu recursivo y en cada opcion debera contestar lo suguiente: - Opc. 1 Que es un array. 
// Opc. 2 Que es una cola Opc. 3 Para que se utiliza la clase arrays Opc. 4 Que es la recursividad Opc. 5 Definicion sobre pilas, arraylist y hashtable.
package Ejercicio_2;

import java.util.*;

public class Preguntas {
    static int opc = 0;
    static String opcc = "";
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        menuP();
    }
    
    public static void menuP() {
        
        //do{
        System.out.println("    MENU    ");
        System.out.println("1. Que es un array");
        System.out.println("2. Que es una cola");
        System.out.println("3. Para que utiliza la clase arrays");
        System.out.println("4. Que es la recursividad");
        System.out.println("5. Que son pilas");
        System.out.println("6. Que es arrayList");
        System.out.println("7. Que es hashtable");
        System.out.println("8. Salir");
        System.out.println("=====================================");
        System.out.println("Ingrese un opcion: ");
        opc = entrada.nextInt();
        entrada.nextLine();
        
        switch(opc){
            case 1:{
                System.out.println("Se puede decir que es una coleccion de variables ya sea de uno o varios tipos.");
                menuP();
                break;
            }
            case 2:{
                System.out.println("Es una estructura que almacena datos, teniendo como principio 'Primero en entrar, primero en salir'.");
                menuP();
                break;
            }
            case 3:{
                System.out.println("Se utiliza para reservar espacio en memoria y asi almacenar datos que pueden ser de un solo tipo o de vadios tipos.");
                menuP();
                break;
            }
            case 4:{
                System.out.println("Es una funcion que se llama a si misma, y esta termina hasta que le indiquemos.");
                menuP();
                break;
            }
            case 5:{
                System.out.println("Es una lista ordenada (estructura de datos) que almacena y recupera datos, teniendo como principio");
                System.out.println("'Ultimo en entrar, primero en salir'.");
                menuP();
                break;
            }
            case 6:{
                System.out.println("Es una estructura de datos, funciona como  un arreglo dinamico, es decir que va creciendo mientras");
                System.out.println("vamos ingresando datos o los vamos eliminando.");
                menuP();
                break;
            }
            case 7:{
                System.out.println("Es una estructura de datos que utiliza datos mediante una llave, devolviente un valor.");
                menuP();
                break;
            }
            case 8:{
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Opcion invalida...");
                menuP();
                break;
            }
        }
            //System.out.println("Desea regresar al menu principal? [S/N]");
            //opcc = entrada.nextLine();
        //}while(opcc.toUpperCase().equals("S"));   
    }   
}