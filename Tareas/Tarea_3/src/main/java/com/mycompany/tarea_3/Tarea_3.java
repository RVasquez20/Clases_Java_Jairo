package com.mycompany.tarea_3;

import javax.swing.JOptionPane;
import java.util.*;
public class Tarea_3 {

    public static void main(String[] args) {
        
        int totalAPagar = 0;
        int cantClientes = 0;
        
        String nombre = "";
        String apellido = "";
        String fecha = "";
        int cantidad = 0;
        int aPagar = 0;
        int aPagar1 = 0;
        int confirmar = 0;
        String auxCompra = "";
        int compra = 0;
        
        cantClientes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de clientes: "));
        
        //Integer array[] = new Integer[2];
        //Queue<Integer>cola1=new LinkedList<>();
        String arrayNombres[] = new String[cantClientes];
        String arrayApellidos[] = new String[cantClientes];
        String arrayFechas[] = new String[cantClientes];
        Queue <String> colaProductos = new LinkedList<>();
        colaProductos.add("Pan");
        colaProductos.add("Cereal");
        Integer arrayCantidades[] = new Integer[cantClientes];
        Integer arrayCostoU[] = new Integer[cantClientes];
        
        for (int i=0; i<cantClientes; i++) {
            arrayNombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
            arrayApellidos[i] = JOptionPane.showInputDialog("Ingrese el apellido del cliente: ");
            arrayFechas[i] = JOptionPane.showInputDialog("Ingrese la fecha de la compra: ");
            auxCompra = JOptionPane.showInputDialog(null,"Que producto desea comprar? " + colaProductos.toString());
            arrayCostoU[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo unitario: "));
            arrayCantidades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a comprar: "));
            if(auxCompra.equals("Pan")){
                compra =  arrayCantidades[i] * arrayCostoU[i];
            }else
                if(auxCompra.equals("Cereal")){
                    compra =  arrayCantidades[i] * arrayCostoU[i];
                }
            totalAPagar = compra;
            
            JOptionPane.showMessageDialog(null,"Nombre: " + arrayNombres[i] + "\n"
            +"Apellido: " + arrayApellidos[i] + "\n"
            +"Fecha de compra: " + arrayFechas[i] + "\n\n"
            +"Producto" + "        " + "Cantidad" + "        " + "Costo unitario" + "\n"
            +"=================================" + "\n"
            +auxCompra + "                    " + arrayCantidades[i] + "                   " + arrayCostoU[i] + "\n"
            +"=================================" + "\n"
            +"Total a pagar: " + totalAPagar);
        }
    }
}