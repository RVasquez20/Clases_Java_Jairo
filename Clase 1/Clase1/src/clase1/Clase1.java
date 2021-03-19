/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
//Ejemplo de tipo de datos      
//      int numero=0;
//      char caracter;
//      String string;
//      double doble=0.0;
//      float flotante=(float) 0.0;
//      boolean condicion=false;
//      
//        System.out.println("Digite un numero entero:");
//        numero=entrada.nextInt();
//        entrada.nextLine();
//        System.out.println("Digite un caracter:");
//        caracter=entrada.nextLine().charAt(0);   
//        System.out.println("Digite un string:");
//        string=entrada.nextLine();
//        System.out.println("Digite un double:");
//        doble=entrada.nextDouble();    entrada.nextLine();
//        System.out.println("Digite un float:");
//        flotante=entrada.nextFloat();    entrada.nextLine();
//        System.out.println("Digite un boolean");
//        condicion=entrada.nextBoolean(); 
//        System.out.println("El numero entero es "+numero);
//        System.out.println("El caracter es "+caracter);
//        System.out.println("El String es "+string);
//        System.out.println("El double es "+doble);
//        System.out.println("El flotante es "+flotante);
//        System.out.println("El boolean es "+condicion);
      
//Ejemplo de condicional if , verificando si la edad es mayor a 18 años
//sout=System.out.println();
//serr=System.err.println();
//int Edad=0;
//
//        System.out.println("Digite la edad de la persona");
//        Edad=entrada.nextInt();entrada.nextLine();
//        
//        if (Edad>18) {
//            System.out.println("Es mayor de edad :D");
//        }else{
//            System.err.println("Es Menor De Edad");
//        }
//Ejemplo JOptionPane
//showMessageDialog
//Mensaje en pantalla plano(no tiene icono )
// JOptionPane.showMessageDialog(null,"Este es un Mensaje","Mensaje de prueba",JOptionPane.PLAIN_MESSAGE);
 //Mensaje en pantalla Pregunta
//JOptionPane.showMessageDialog(null,"Este es un Mensaje?","Mensaje de prueba2",JOptionPane.QUESTION_MESSAGE);
 //Mensaje en pantalla Informativo
//JOptionPane.showMessageDialog(null,"Ultima hora, Este es un Mensaje","Mensaje de prueba3",JOptionPane.INFORMATION_MESSAGE);
 //Mensaje en pantalla De Error
//JOptionPane.showMessageDialog(null,"Este es un Mensaje de Error","Mensaje de prueba4",JOptionPane.ERROR_MESSAGE);
 //Mensaje en pantalla Advertencia
//JOptionPane.showMessageDialog(null,"Este es un Mensaje de Advertencia","Mensaje de prueba5",JOptionPane.WARNING_MESSAGE);
//showInputDialog
//String Entrada;
//Entrada=JOptionPane.showInputDialog(null,"Ingrese una cadena:","Ingreso",JOptionPane.QUESTION_MESSAGE);
//JOptionPane.showMessageDialog(null,"Lo digitado es "+Entrada,"Mensaje de prueba3",JOptionPane.INFORMATION_MESSAGE);
//double Numero=0;
//Numero=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un numero:","Ingreso",JOptionPane.QUESTION_MESSAGE));
//JOptionPane.showMessageDialog(null,"Lo digitado es "+Numero,"Mensaje de prueba3",JOptionPane.INFORMATION_MESSAGE);
//Ejemplo 2 verificando si la edad es mayor a 18 años, con joptionpane
//int Edad=0;
//
//       Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
//        
//        if (Edad>18) {
//           JOptionPane.showMessageDialog(null,"Es mayor de edad","Mayor de edad",JOptionPane.INFORMATION_MESSAGE);
//        }else{
//           JOptionPane.showMessageDialog(null,"No es mayor de edad","Menor de edad",JOptionPane.ERROR_MESSAGE);
//        }
//Ejemplo 3 verificando si la edad es mayor a 18 años,utilizando do while con joptionpane
//int Edad=0,opc=0;
//do{
//       Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
//        
//        if (Edad>18) {
//           JOptionPane.showMessageDialog(null,"Es mayor de edad","Mayor de edad",JOptionPane.INFORMATION_MESSAGE);
//        }else{
//           JOptionPane.showMessageDialog(null,"No es mayor de edad","Menor de edad",JOptionPane.ERROR_MESSAGE);
//        }
//    opc=JOptionPane.showConfirmDialog(null,"Desea Seguir?","Seguir?",JOptionPane.YES_NO_OPTION);
//}while(opc!=JOptionPane.NO_OPTION); 
//Ejemplo 4: base de menu
 JOptionPane.showMessageDialog(null,"1)Suma\n2)Resta\n3)Multiplicacion\n4)Division\n"
         + "5)Cuadrado\n6)Salir","Menu",JOptionPane.PLAIN_MESSAGE);
 
 //Tarea:Hacer El menu con las opciones funcionales de este Ejemplo 4
    }
}
