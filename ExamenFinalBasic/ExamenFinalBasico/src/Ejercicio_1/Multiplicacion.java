/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jair_
 */
public class Multiplicacion extends Calculadora {
    double multiplicacion;

    public Multiplicacion() {
    }

    public Multiplicacion(double multiplicacion, double numeroUno, double numeroDos) {
        super(numeroUno, numeroDos);
        this.multiplicacion = multiplicacion;
    }
    
    public void ingresoDatos() {
        numeroUno = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primero numero: "));
        numeroDos = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero: "));
        multiplicacion = numeroUno * numeroDos;
    }
    
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null,"La suma de los numero es: " + multiplicacion);
    }
}