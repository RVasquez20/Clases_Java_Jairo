import javax.swing.JOptionPane;
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
6)Salir
*/
public class Tarea_2 {
    public static void main(String[] args) {
        int OpcMenu = 0;
        int Opc = 0;
        do{
            
            OpcMenu = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Ejercicio 1\n"
                +"2. Ejercicio 2\n"
                +"3. Ejercicio 3\n"
                +"4. Ejercicio 4\n"
                +"5. Ejercicio 6\n"
                +"6. Salir","Menu Principal",JOptionPane.PLAIN_MESSAGE));
            switch(OpcMenu){
                case 1:{
                    /*int tamanio = 0;
                    int auxiliar = 0;
                    
                    
                    tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamanio de su array:"));
                    
                    int[] enteros = new int[tamanio];
                    
                    for(int i=0; i<tamanio; i++){
                        enteros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
                    }
                    for(int i=0; i<sizeof(enteros)/sizeof(int); i++){
                        for(int j=0; j<sizeof(enteros)/sizeof(int); j++){
                            if(enteros[j]>enteros[j+1]){
                                auxiliar = enteros[j];
                                enteros[j] = enteros[j+1];
                                enteros[j+1] = auxiliar;
                            }
                        }
                    }
                    for(int x: enteros){
                        JOptionPane.showMessageDialog(null,"Mostrando numeros: " + x);
                    }
                    /*for(int k=0; k<tamanio; k++){
                        JOptionPane.showMessageDialog(null,"Mostrando numeros: " + enteros);
                    }*/
                    break;
                }
                case 2:{
                    int t = 0;
                    
                    t = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamanio de su array: "));
                    
                    String[] palabras = new String[t];
                    
                    for(int i=0; i<t; i++){
                        palabras[i] = JOptionPane.showInputDialog("Ingrese un nombre: ");
                    }
                    for(int j=t-1; j>=0; j--){
                        JOptionPane.showMessageDialog(null,palabras[j]);
                    }
                    break;
                }
                case 3:{
                    String acroPalabras = "";
                    String acroPalabras1 = "";
                    
                    String[] acronimos = new String[]{"Holanda","Ortencia","Linda","Alfredo"};
                    String[] acronimos2 = new String[]{"Magdalena","Ubeda","Nancy","Domingo","Oscar"};
                    
                    for(int i=0; i<= acronimos.length-1; i++){
                        acroPalabras += acronimos[i].charAt(0)+"\n";
                    }
                    for(int i=0; i<= acronimos2.length-1; i++){
                        acroPalabras1 += acronimos2[i].charAt(0)+"\n";
                    }
                    JOptionPane.showMessageDialog(null,acroPalabras + "\n" + acroPalabras1);
                    break;
                }
                case 4:{
                    int tamanio = 0;
                    int ca1 = 1;
                    int ca2 = 1;
                    int caR = 1;
                    
                    tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamanio de sus arrays:"));
                    
                    int[] array1 = new int [tamanio];
                    int[] array2 = new int [tamanio];
                    int[] arrayR = new int [tamanio];
                    
                    for(int i=0; i<tamanio; i++){
                        array1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del array 1 en la posicion " + ca1++));
                        array2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del array 2 en la posicion " + ca2++));
                        arrayR[i] = array1[i] * array2[i];
                    }
                    for(int i=0; i<tamanio; i++){
                        JOptionPane.showMessageDialog(null,"La multiplicacion de los numeros en la pocision " + caR++ + " es: " + arrayR[i],"Resultados",JOptionPane.INFORMATION_MESSAGE);    
                    }
                    break;
                }
                case 5:{
                    // Mostar el resultado en varias ventanas
                    /*int tamanio = 0;
                    
                    tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamanio de sus arrays:"));
                    
                    String[] nombres = new String[tamanio];
                    int[] edad = new int[tamanio];
                    
                    for(int i=0; i<tamanio; i++){
                        nombres[i] = JOptionPane.showInputDialog("Ingresar nombre: ");
                        edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
                    }
                    for(int i=0; i<tamanio; i++){
                        JOptionPane.showMessageDialog(null,"Nombre: " + nombres[i] + "\n" + "Edad: " + edad[i],"Informacion",JOptionPane.INFORMATION_MESSAGE);
                    }*/
                    // Mostarlos en una sola ventana
                    int tamanio = 0;
                    String textos = "";
                    
                    tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamanio de sus arrays:"));
                    
                    String[] nombres = new String[tamanio];
                    int[] edad = new int[tamanio];
                    
                    for(int i=0; i<tamanio; i++){
                        nombres[i] = JOptionPane.showInputDialog("Ingresar nombre: ");
                        edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
                    }
                    for(int i=0; i<tamanio; i++){
                        textos += nombres[i]+"\n"+edad[i]+"\n"+"-------"+"\n";
                    }
                    JOptionPane.showMessageDialog(null,textos);
                    break;
                }
                case 6:{
                    JOptionPane.showMessageDialog(null,"Gracias por utilizar este programa :D");
                    System.exit(0);
                }
                default:{
                    JOptionPane.showMessageDialog(null,"Opcion incorrecta...","Error",JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
            Opc = JOptionPane.showConfirmDialog(null,"Dese ingresar a otro ejercicio?","Eleccion",JOptionPane.YES_NO_OPTION);
        }while(Opc!=JOptionPane.NO_OPTION);
    }
    
}
