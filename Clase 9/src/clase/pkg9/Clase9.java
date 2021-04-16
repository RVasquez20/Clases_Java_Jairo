/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg9;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personas obj1=new Personas();
        int seleccion=0;
        String cambio="";
        int cambio2=0;
        //ob1,obj2,obj3,obj4//ArrPersonas
        //0,   1  ,  2 , 3
        //MenuDeCambios();
        //3->indice=2
        //ArrPersonas[indice].setNombre();
        obj1.Ingreso();
        JOptionPane.showMessageDialog(null, obj1.toString());
        seleccion=Integer.parseInt(JOptionPane.showInputDialog(null, "1)Nombre\n2)Apellido\n3)Edad\n4)Telefono\n5)Direccion\n6)No Cambiar Nada","Menu De Cambios",JOptionPane.QUESTION_MESSAGE));
        
        switch(seleccion){
            case 1:{
                cambio=JOptionPane.showInputDialog("Ingrese el nuevo Nombre");
                obj1.setNombre(cambio);
                break;
            }
            case 2:{
                cambio=JOptionPane.showInputDialog("Ingrese el nuevo Apellido");
                obj1.setApellido(cambio);
                break;
            }
            case 3:{
                cambio2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo Edad"));
                obj1.setEdad(cambio2);
                break;
            }
            case 4:{
                cambio2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo Telefono"));
                obj1.setTelefono(cambio2);
                break;
            }
            case 5:{
                cambio=JOptionPane.showInputDialog("Ingrese el nuevo Direccion");
                obj1.setDireccion(cambio);
                break;
            }
            case 6:{
                
                break;
            }
            
            default:{
                JOptionPane.showMessageDialog(null, "Opcion inexistente se salta el cambio");
                break;
            }
            
        }
        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, "Nombre:"+obj1.getNombre());
    }
    
}
