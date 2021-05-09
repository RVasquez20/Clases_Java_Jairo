/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg17;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Rodrigo
 */
public class Clase17 {
static Scanner entrada=new Scanner(System.in);
static ArrayList<Estudiante>Estudiantes=new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menuPrincipal();
     /**
      * Ejercicio:
      * Cree un pequeño control para los estudiantes de la UMG 
      * el cual debe constar con clases y objetos propios
      * El funcionamiento sera el siguiente:
      * 1)Ingreso de estudiantes
      * 2)Ingreso de notas
      * 3)Mostrar Datos de cierto estudiante<Uno en especifico>
      * 4)Salir
      */
    }
    
    public static void menuPrincipal(){
        int opc=0;
        System.out.println("MENU PRINCIPAL");
        System.out.println("1)Ingreso de Estudiantes");
        System.out.println("2)Ingreso de Notas");
        System.out.println("3)Mostrar datos de estudiante en especifico");
        System.out.println("4)Salir");
        System.out.println("-----------------------------------------------");
        System.out.println("Seleccione la opcion que desea:");
        opc=entrada.nextInt();entrada.nextLine();
        switch(opc){
            case 1:{
                IngresoEstudiantes();
                menuPrincipal();
                break;
            }
            default:{
                System.out.println("Opcion incorrecta elija nuevamente");
                System.out.println("");
                menuPrincipal();
                break;
            }
        }
    }

    private static void IngresoEstudiantes() {
       String Nombre="",Apellido="",Edad="",Carne="",Semestre="";
        System.out.println("Ingrese el nombre del estudiante");
        Nombre=entrada.nextLine();
        System.out.println("Ingrese el Apellido del estudiante");
        Apellido=entrada.nextLine();
        System.out.println("Ingrese el Edad del estudiante");
        Edad=entrada.nextLine();
        System.out.println("Ingrese el Carne del estudiante");
        Carne=entrada.nextLine();
        System.out.println("Ingrese el Semestre del estudiante");
        Semestre=entrada.nextLine();
        Estudiantes.add(new Estudiante(Carne,Semestre,new Notas(new ArrayList<>()),Nombre,Apellido,Edad));
        JOptionPane.showMessageDialog(null, "Agregado Exitosamente");
    }
    
}
