/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg8;
import clase.pkg8.Clase8.Calcu;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Menu {
    Scanner entrada=new Scanner(System.in);
    void menuPrincipal() {
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
    }
}
