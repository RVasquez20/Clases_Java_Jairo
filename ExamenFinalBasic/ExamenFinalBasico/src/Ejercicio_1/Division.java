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
public class Division extends Calculadora {
    double division;

    public Division() {
    }

    public Division(double division, double numeroUno, double numeroDos) {
        super(numeroUno, numeroDos);
        this.division = division;
    }
    
    public void ingresoDatos() {
        numeroUno = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primero numero: "));
        numeroDos = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero: "));
        division = numeroUno / numeroDos;
    }
    
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null,"La suma de los numero es: " + division);
    }
    
}
