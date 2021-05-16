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
public class Resta extends Calculadora {
    double resta;

    public Resta() {
    }

    public Resta(double resta, double numeroUno, double numeroDos) {
        super(numeroUno, numeroDos);
        this.resta = resta;
    }
    
    public void ingresoDatos() {
        numeroUno = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primero numero: "));
        numeroDos = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero: "));
        resta = numeroUno - numeroDos;
    }
    
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null,"La suma de los numero es: " + resta);
    }
}