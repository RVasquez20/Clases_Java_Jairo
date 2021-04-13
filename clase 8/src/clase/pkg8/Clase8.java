/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg8;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Clase8 {
static Scanner entrada=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu obj2=new Menu();
    obj2.menuPrincipal();
    }

    /*private static void menuPrincipal() {
        Calcu obj1=new Calcu();  
    int opc=0;
        System.out.println("MENU PRINCIPAL");
        System.out.println("   1)Sumar    ");
        System.out.println("   2)Restar    ");
        System.out.println("   3)Potencia    ");
        System.out.println("");
        System.out.println("Ingrese la opcion que desea:");
        opc=entrada.nextInt();
        switch(opc){
            case 1:{
                obj1.Ingreso();
                obj1.Sumar();
                menuPrincipal();
                break;
            }
           case 2:{
                obj1.Ingreso();
                obj1.Restar();
                menuPrincipal();
                break;
            }
           case 3:{
               System.out.println("Ingrese el exponente:");
               int exponente=entrada.nextInt();
                obj1.Ingreso(exponente);
                obj1.Potencia();
                menuPrincipal();
                break;
            }
            default:{
                System.out.println("Opcion Inexistente");
                menuPrincipal();
                break;
            }
        }
    }*/
    
public static class Calcu{
    int numeroUno,numeroDos;
    
    public Calcu(){}
    
    public void Ingreso(){
        System.out.println("Ingrese el numero 1:");
        numeroUno=entrada.nextInt();
        System.out.println("Ingrese el numero 2:");
        numeroDos=entrada.nextInt();
    }
    public void Ingreso(int Exponente){
        numeroDos=Exponente;
        System.out.println("Ingrese el numero base:");
        numeroUno=entrada.nextInt();
    }

        void Sumar() {
            System.out.println("La suma Es:"+(numeroUno+numeroDos));
        }

         void Restar() {
           System.out.println("La Resta Es:"+(numeroUno-numeroDos));
        }

         void Potencia() {
            System.out.println("La potencia es:"+(Math.pow(numeroUno, numeroDos)));
        }


    
    
    
}
    
    
}
