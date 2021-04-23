/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg11;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Clase11 {

    /**
     * @param args the command line arguments
     */
    /*Contruir un programa que dada una serie de vehiculos caracterizados por 
    su marca,modelo y precio, muestre las propiedades del vehiculo mas barato.
    Para ello se deberan leer por teclado las caracteriscas de cada vehiculo y crer una clase
    que represente a cada uno de los mismos*/
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String marca,modelo;
        float precio=(float)0.0;
        int numeroDeVehiculos=0,posicionMasBarato=0;
        System.out.println("Digite la cantidad de Vehiculos:");
        numeroDeVehiculos=entrada.nextInt();
        entrada.nextLine();
        Vehiculo carros[]=new Vehiculo[numeroDeVehiculos];
        
        for(int i=0;i<carros.length;i++){
            System.out.println("Digite las caracteristicas del carro "+(i+1)+":");
            System.out.println("Ingrese la Marca:");
            marca=entrada.nextLine();//Siempre para un string o un char usar NextLine 
            System.out.println("Ingrese el modelo:");
            modelo=entrada.nextLine();
            System.out.println("Ingrese el precio:");
            precio=entrada.nextFloat();entrada.nextLine();
            
            carros[i]=new Vehiculo(marca,modelo,precio);
        }
        posicionMasBarato=posicionCarroMasBarato(carros);
        System.out.println(carros[posicionMasBarato].toString());
    }
    /*
    carro:  c1          c2              c3
    Precio: 12          32              9
    Pos:    0           1               2
    precio=9;
    32<9 no se cumple
    9<12 si se cumple
    precio=9;
    pos=2;
    carro[2].getPrecio();->9
    */
    public static int posicionCarroMasBarato(Vehiculo Carro[]){
        float precio=(float)0.0;
        int pos=0;
        precio=Carro[0].getPrecio();
        for(int i=1;i<Carro.length;i++){
            if(Carro[i].getPrecio()<precio){
                precio=Carro[i].getPrecio();
                pos=i;
            }
        }
        return pos;
    }
    
}
