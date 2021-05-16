// Ejercicio 1: Realizar una calculadora por medio de clases o metodos que usted considere necesarios, debe ser presentada con JOptionPane.
package Ejercicio_1;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

    public static void main(String[] args) {
        int opc = 0;
        int opcc = 0;
        
        Suma sumas = new Suma();
        Resta restas = new Resta();
        Multiplicacion mutiplicaciones = new Multiplicacion();
        Division divisiones = new Division();
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,"    MENU" +
                    "\n1. Suma" +
                    "\n2. Resta" +
                    "\n3. Multiplicacion" +
                    "\n4. Division" +
                    "\n5. Salir"));
            switch(opc){
                case 1:{
                    sumas.ingresoDatos();
                    sumas.mostrarDatos();
                    break;
                }
                case 2: {
                    restas.ingresoDatos();
                    restas.mostrarDatos();
                    break;
                }
                case 3: {
                    mutiplicaciones.ingresoDatos();
                    mutiplicaciones.mostrarDatos();
                    break;
                }
                case 4: {
                    divisiones.ingresoDatos();
                    divisiones.mostrarDatos();
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,"Opcion incorrecta...");
                    break;
                }
            }
            opcc = JOptionPane.showConfirmDialog(null,"Desea regresar al menu principal?","Confirmar",JOptionPane.YES_NO_OPTION);
        }while(opcc != JOptionPane.NO_OPTION);
    }   
}