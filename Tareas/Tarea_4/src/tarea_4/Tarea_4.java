package tarea_4;

import java.util.*;

public class Tarea_4 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        int opc = 0;
        String opcM = "";
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("===MENU PRINCIPAL===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Salir");
            System.out.println("====================");
            System.out.println("Ingrese una opcion: ");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1:{
                    calc.suma();
                    break;
                }
                case 2:{
                    calc.resta();
                    break;
                }
                case 3:{
                    calc.multiplicacion();
                    break;
                }
                case 4:{
                    calc.division();
                    break;
                }
                case 5:{
                    calc.potenciacion();
                    break;
                }
                case 6:{
                    System.out.println("Gracias por utilizar este programa :D");
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Opcion incorrecta");                   
                }
            }
            System.out.println("Desea regresar al menu principal? [S/N]");
            opcM = entrada.next();
        }while(opcM.toUpperCase().equals('S'));   
    }
}