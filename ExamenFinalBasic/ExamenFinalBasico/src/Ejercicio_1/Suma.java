package Ejercicio_1;

import javax.swing.JOptionPane;

public class Suma extends Calculadora{
    double suma;

    public Suma() {
    }

    public Suma(double suma, double numeroUno, double numeroDos) {
        super(numeroUno, numeroDos);
        this.suma = suma;
    }
    
    public void ingresoDatos() {
        numeroUno = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primero numero: "));
        numeroDos = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero: "));
        suma = numeroUno + numeroDos;
    }
    
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null,"La suma de los numero es: " + suma);
    }
    
}