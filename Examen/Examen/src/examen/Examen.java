/*
Realice un menu con los siguientes ejercicios:(JOptionPane)
1)Dado un vector de enteros, comprobar el mayor, el menor y por último la media de todos.
2)Realizar un crud de Empleados<solo nombres>, como guste con cualquier edd
3)Realizar una calculadora basica
4)Realice un minisupermercado donde le aparezcan las siguientes opciones:
    1)un menu con los productos
    2)pedir cuantos comprara
    3)calcular total
    4)almacenar clientes en una cola :)
*/
package examen;

import java.util.*;
import javax.swing.JOptionPane;

public class Examen {
    public static void main(String[] args) {
        int opc = 0;
        int opcm = 0;
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,"===MENU PRINICPAL===" + "\n"
                    + "1. Ejercicio 1" + "\n"
                    + "2. Ejercicio 2" + "\n"
                    + "3. Ejercicio 3" + "\n"
                    + "4. Ejercicio 4" + "\n"
                    + "5. Salir","Menu Principal",JOptionPane.INFORMATION_MESSAGE));            
            switch(opc){
                case 1:{
                    Integer enteros[]={5,10,3,25,35,40,2,78};
                    
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    int opccalcu = 0;
                    int opccalcuu = 0;
                    double n1, n2, suma, resta, multiplicacion, division, resultado = 0.0;
                    do{
                        opccalcu = Integer.parseInt(JOptionPane.showInputDialog(null,"===CALCULADORA===" + "\n"
                            + "1. Suma" + "\n"
                            + "2. Resta" + "\n"
                            + "3. Multiplicacion" + "\n"
                            + "4. Division" + "\n"
                            + "5. Salir","Calculadora",JOptionPane.INFORMATION_MESSAGE));            
                                switch(opccalcu){
                                    case 1:{
                                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
                                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
                                        suma = n1 + n2;
                                        JOptionPane.showMessageDialog(null,"La suma de los numero es: " + suma);
                                        break;
                                    }
                                    case 2:{
                                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
                                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
                                        resta = n1 - n2;
                                        JOptionPane.showMessageDialog(null,"La suma de los numero es: " + resta);
                                        break;
                                    }
                                    case 3:{
                                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
                                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
                                        multiplicacion = n1 * n2;
                                        JOptionPane.showMessageDialog(null,"La suma de los numero es: " + multiplicacion);
                                        break;
                                    }
                                    case 4:{
                                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
                                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
                                        division = n1 / n2;
                                        JOptionPane.showMessageDialog(null,"La suma de los numero es: " + division);
                                        break;
                                    }
                                    case 5:{
                                        JOptionPane.showMessageDialog(null,"Gracias por utilizar este programa :D","Salida",JOptionPane.INFORMATION_MESSAGE);
                                        System.exit(0);
                                        break;
                                    }
                                    default:{
                                        JOptionPane.showMessageDialog(null,"Opcion Incorrecta","Error",JOptionPane.ERROR_MESSAGE);
                                        break;
                                    }
                                }
                                opccalcuu = JOptionPane.showConfirmDialog(null,"Desea regresar al menu principal","Eleccion",JOptionPane.YES_NO_OPTION);
                            }while(opccalcuu!=JOptionPane.NO_OPTION);
                    break;
                }
                case 4:{
                    String productos[]={"Pan","Cereal","Leche","Huevos"};
                    Integer precios[]={5,45,24,3};
                    Queue <String> clientes = new LinkedList<>();
                    
                    int cantidad = 0;
                    int variable = 0;
                    clientes.add(JOptionPane.showInputDialog("Ingrese el nombre del cliente: "));
                    
                    variable = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice del producto que desea comprar: [0(Pan),1(Cereal),2(Leche),3(Huevos)]"));
                                       
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a comprar: "));
                    if(variable == 0){
                        JOptionPane.showMessageDialog(null,"El total a pagar es: " + variable * precios[0]);
                    }else
                        if(variable == 1){
                        JOptionPane.showMessageDialog(null,"El total a pagar es: " + variable * precios[1]);
                            }else
                                if(variable == 2){
                                JOptionPane.showMessageDialog(null,"El total a pagar es: " + variable * precios[2]);
                                    }else
                                        if(variable == 3){
                                        JOptionPane.showMessageDialog(null,"Gracias por su compra estimado" + clientes.toString() + " el total a pagar es: " + variable * precios[3]);
                                            }
                    break;
                }
                case 5:{
                    JOptionPane.showMessageDialog(null,"Gracias por utilizar este programa :D","Salida",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null,"Opcion Incorrecta","Error",JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
            opcm = JOptionPane.showConfirmDialog(null,"Desea regresar al menu principal","Eleccion",JOptionPane.YES_NO_OPTION);
        }while(opc!=JOptionPane.NO_OPTION);
    }    
}