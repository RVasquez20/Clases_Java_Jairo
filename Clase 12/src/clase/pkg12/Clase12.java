/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg12;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Clase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /* Numeros        2     4    6
        
        Indices        0     1    2
        */
//        int[] V1=new int[3];
//     V1[0]=2;
//     V1[1]=4;
//     V1[2]=6;
//     int n=0;
//     n=V1[2];
//        System.out.println(n);

/*
Ejecicio: 
Diseñe un programa para trabajar con triangulos isóceles.
Para ello defina los atributos
necesarios que se requieren, proporcione metodos de consulta, 
un metodo constructor
e implemente los metodos para calcular el perimetro y el area de 
un triangulo ,
ademas implemetar un metodo que apartir de un arreglo de triangulos 
devuelva
el area del triangulo con mayor supericie.
P=2xl+b
       ---------
A=  b*|l^2-b^2/4
    -------------
          2
*/
Scanner entrada=new Scanner(System.in);
double base,lado;
int numeroDeTriangulos;
        System.out.println("Ingrese el numero de triangulos a digitar");
        numeroDeTriangulos=entrada.nextInt();entrada.nextLine();
        Tiangulo_Isoceles[] triangulos=new Tiangulo_Isoceles[numeroDeTriangulos];
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("Ingrese los valores para el triangulo no."+(i+1));
            System.out.println("Ingrese un lado del triangulo:");
            lado=entrada.nextInt();
            System.out.println("Ingrese un base del triangulo:");
            base=entrada.nextInt();
            
            triangulos[i]=new Tiangulo_Isoceles(base,lado);
            System.out.println(triangulos[i].toString());
            System.out.println("El perimetro del triangulo es:"+triangulos[i].obtenerPerimetro());
            System.out.println("El Area del triangulo es:"+triangulos[i].obtenerArea());
        }
        int posAreaMayor=mayorArea(triangulos);
        System.out.println("El area de mayor superficie es:"+triangulos[posAreaMayor].obtenerArea());
    }
    
    public static int mayorArea( Tiangulo_Isoceles[] t1){
        double area;
        int pos=0;
        area=t1[0].obtenerArea();
        for (int i = 1; i < t1.length; i++) {
            if (t1[i].obtenerArea()>area) {
                area=t1[i].obtenerArea();
                pos=i;
            }

        }
        return pos;
    }
    
    /*
    TAREA:
    Construir un programa para trabajar con 2 numeros complejos, implemente
    el siguiente menu:
    1:Sumas 2 numeros complejos
    2:Multiplicar 2 numeros complejos
    3:comparar 2 numeros complejos(iguales o no iguales)
    4:multiplicar un numero complejo por un entero
    5:salir
    
    */
}
