/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractos;

/**
 *
 * @author Rodrigo
 */
public class principal {
    public static void main(String[] args) {
        Planta ob1=new Planta();
        ob1.alimentarse();
        Hervivoro onj2=new Hervivoro();
        onj2.alimentarse();
        Carnivoro obj3=new Carnivoro();
        obj3.alimentarse();
    }
}
