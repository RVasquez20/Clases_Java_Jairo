/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg16;

/**
 *
 * @author Rodrigo
 */
public class Clase16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo[] misVehiculos=new Vehiculo[4];
        misVehiculos[0]=new Vehiculo("GH6C","Audi","A7");
        misVehiculos[1]=new Vehiculo_Turismo(4,"GH7C","AntiguaTours","2021");
        misVehiculos[2]=new Vehiculo_Deportivo(600,"GH8C","Ferrari","A89");
        misVehiculos[3]=new Vehiculo_Fulgoneta(200,"GH12C","Fulgo1","F23");
        for (Vehiculo misVehiculo : misVehiculos) {
            System.out.println(misVehiculo.MostrarDatos());
        }
    }
    
    /*
    Hacer un programa para calcular el area de poligonos
    (triangulos y rectangulos)el programa debe de ser capaz de almacenar 
    en un arrayList N triangulos y rectangulos(utilizar una pregunta si desea continuar
    ingresando y  si dice que si mostrar un menu si desea agregar triangulo o rectangulo) y al final
    mostrar el area y los datos de cada uno.
    Para ello tendra lo siguiente:
    -Una superclase llamada Poligono
    .una subclase llamada Rectangulo
    -Una subclase llamada Triangulo
    al finalizarse el programa antes de cerrarce debera mostrar la cantidad de 
    triangulos listados y rectangulos listados
    utilizar JOptionPane :D
    
    Proxima clase manejo de Excepciones
    */
}
