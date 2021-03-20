import static java.lang.System.exit;
import java.util.*;
import javax.swing.JOptionPane;

public class Tarea_1 {
    public static void main(String[] args) {
        int opcS = 0;
        int opc = 0;
        
        //loop:
        do{
            opcS = Integer.parseInt(JOptionPane.showInputDialog("1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n5.Cuadrado\n6.Salir"));

            switch(opcS){
                case 1:{
                    double n1 = 0.0;
                    double n2 = 0.0;
                    double suma = 0.0;
                    
                    n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    suma = n1 + n2;
                    //JOptionPane.showMessageDialog(null,"La suma de los numeros ingresados es: " + suma + "Resultado",JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null,"La suma de los numeros ingresados es: " + suma);
                    break;
                }
                case 2:{
                    double n1 = 0.0;
                    double n2 = 0.0;
                    double resta = 0.0;
                    
                    n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    resta = n1 - n2;
                    JOptionPane.showMessageDialog(null,"La resta de los numeros ingresados es: " + resta);
                    break;
                }
                case 3:{
                    double n1 = 0.0;
                    double n2 = 0.0;
                    double multiplicacion = 0.0;
                    
                    n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primero numero: "));
                    n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    multiplicacion = n1 * n2;
                    JOptionPane.showMessageDialog(null,"La multiplicacion de los numeros ingresados es: " + multiplicacion);
                    break;
                }
                case 4:{
                    double n1 = 0.0;
                    double n2 = 0.0;
                    double division = 0.0;
                    
                    n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primero numero: "));
                    n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    division = n1 / n2;
                    JOptionPane.showMessageDialog(null,"La division de los numeros ingresados es: " + division);
                    break;
                }
                case 5:{
                    double n1 = 0.0;
                    double cuadrado = 0.0;
                    
                    n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero a elevar al cuadrado: "));
                    cuadrado = n1 * n1;
                    JOptionPane.showMessageDialog(null,"El cuadrado de los numero ingresados es: " + cuadrado);
                    break;
                }
                case 6:{
                    exit(0);
                }
                default:{
                    JOptionPane.showMessageDialog(null,"Opcion incorrecta, intente nuevamente...","Error",JOptionPane.ERROR_MESSAGE);
                    //goto loop;
                    break;
                }
            }
            opc=JOptionPane.showConfirmDialog(null,"Desea realizar otra operacion?","Operaciones",JOptionPane.YES_NO_OPTION);
        }while(opc != JOptionPane.NO_OPTION);
    }   
}