/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
/**
 * Switch-while-for-Arrays=unidimensionales-foreach
 * 
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* int opc=0,opcMenu=0,numero1=0,numero2=0,R=0;
        String palabra="";
    
        ARCA:
        A
        R
        C
        A
      
        do{
            opcMenu=Integer.parseInt(JOptionPane.showInputDialog(null,"1)Sumar\n"
                    + "2)Restar\n"
                    + "3)Multiplicar\n"
                    + "4)Dividir\n"
                    + "5)Tablas de 1 al 10\n"
                    + "6)Mostrar una palabra como base de acronimo\n"
                    + "7)Salir","Menu Principal",JOptionPane.PLAIN_MESSAGE));
            switch(opcMenu){
                case 1:{
                    numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero a sumar "));
                    numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo numero a sumar "));
                    R=numero1+numero2;
                    JOptionPane.showMessageDialog(null, "La suma de : "+numero1+"+"+numero2+"="+R);
                    break;
                }
                case 2:{
                    numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero a Restar ","Titulo",JOptionPane.QUESTION_MESSAGE));
                    numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo numero a Restar "));
                    R=numero1-numero2;
                    JOptionPane.showMessageDialog(null, "La Resta de : "+numero1+"-"+numero2+"="+R);
                    break;
                }
                case 3:{
                    numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero a multiplicar "));
                    numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo numero a multiplicar "));
                    R=numero1*numero2;
                    JOptionPane.showMessageDialog(null, "La multiplicacion de : "+numero1+"*"+numero2+"="+R);
                    break;
                }
                case 4:{
                    numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero a Dividir "));
                    numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo numero a Dividir "));
                    R=numero1/numero2;
                    JOptionPane.showMessageDialog(null, "La Division de : "+numero1+"/"+numero2+"="+R);
                    break;
                }
                case 5:{
                    numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la tabla que desea obtener"));
                    for (int i = 1; i <=10; i++) {
                        R=numero1*i;
                    JOptionPane.showMessageDialog(null,numero1+"*"+i+"="+R,"Tablas",JOptionPane.PLAIN_MESSAGE);    
                    }
                    break;
                    
                }
                 case 6:{
                     String acronimo="";
                    palabra=JOptionPane.showInputDialog("Ingrese La palabra");
                    for (int i = 0; i <=palabra.length()-1; i++) {
                     acronimo+=palabra.charAt(i)+"\n";
                    }
                     JOptionPane.showMessageDialog(null,acronimo);  
                    break;
                }
                 case 7:{
                     JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa :D");
                     System.exit(0);
                     break;
                 }
                
                default:{
                    JOptionPane.showMessageDialog(null,"Opcion Incorrecta!!","Error",JOptionPane.ERROR_MESSAGE );
                    break;
                }
            }
            opc=JOptionPane.showConfirmDialog(null, "Desea seguir?","Seguir?",JOptionPane.YES_NO_OPTION);
        }while(opc!=JOptionPane.NO_OPTION);*/
       //int min=250,max=550;
       //int[] numeros=new int[3];
       //numeros[0]=(int)(Math.random()*(max-min+1)+min);
       double[] numeros=new double[3];
       numeros[0]=Math.random();
       numeros[1]=Math.random();
       numeros[2]=Math.random();
        for (double numero : numeros) {
            System.out.println(numero);
        }
        String[] nombres={"Juan","Maria","Pedro"};
        boolean[] condiciones={true,false,true,true};
        int[][] matriz=new int[2][2];//Exactamente igual a c++
        /*
        Tarea: Menu en donde pueda:
        1)ingresar valores a un arreglo de enteros y mostrarlos ordenados
        2)ingresar nombres a un array de string y mostrarlos del ultimo al primero
        3)Definir un array con 4 nombres (Holanda,Ortencia,Linda,Alfredo) y Mostrar el acronimo:
        H
        O
        L
        A
        4)Ingresar 5 valores a un array1, 5 a un array2 y multiplicarlos, el resultado se debe almacenar en un array 3 y mostrarse:
        array1[0]=2;
        array2[0]=3;
        array3[0]=6;//array1[0]*Array2[0]
        5)Pedir nombre y edad almacenarlos respectivamente en sus arrays y mostrar los datos ordenados:
        Array1[0]="Pedro"
        Array2[0]=10
        Array1[1]="Maria"
        Array2[1]=20
        Pedro
        10
        -----
        Maria 
        20
        &)Salir
        */
    }
    
}
