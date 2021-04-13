package tarea_4;

import java.util.*;

public class Calculadora {
    public double numeroUno = 0.0;
    public double numeroDos = 0.0;

    /*public Calculadora(int numeroUno, int numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }*/

    public Calculadora() {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }
    
    public void ingresoDatos(){
        Scanner entradaD = new Scanner (System.in);
        
        System.out.println("Ingrese el primer numero: ");
        numeroUno = entradaD.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numeroDos = entradaD.nextInt();
    }
    
    public void suma(){
        double sumar = 0.0;
        ingresoDatos();
        sumar = numeroUno + numeroDos;
        
        System.out.println("La suma es: " + sumar);
    }
    
    public void resta(){
        double restar = 0.0;
        ingresoDatos();
        restar = numeroUno - numeroDos;
        
        System.out.println("La resta es: " + restar);
    }
    
    public void multiplicacion(){
        double multiplicar = 0.0;
        ingresoDatos();
        multiplicar = numeroUno * numeroDos;
        
        System.out.println("La multiplicacion es: " + multiplicar);
    }
    
    public void division(){
        double dividir = 0.0;
        ingresoDatos();
        dividir = numeroUno / numeroDos;
        
        System.out.println("La division es: " + dividir);
    }
    
    public void potenciacion(){
        Scanner entradaDa = new Scanner (System.in);
        double potencia = 0.0;
        double x = 0.0;
        double y = 0.0;
        
        System.out.println("Ingrese el numero: ");
        x = entradaDa.nextInt();
        
        y = x;
        
        potencia = y * x;
        
        System.out.println("La potencia es: " + potencia);
    }  
}