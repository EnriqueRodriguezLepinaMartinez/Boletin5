/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricky
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      // EJERCICIO 1
        int n = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
        if(n>0) System.out.println(n + " e positivo");
        
        // EJERCICIO 2
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Numero2"));
        
        if(n1>=n2)
            System.out.println("Resta: "+ (n1-n2));
        
        System.out.println("Suma: "+ (n1+n2));
        
        // EJERCICIO 3
         int n3 = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
        
        if(n>0)
            System.out.println("+");
        else if(n == 0)
            System.out.println("0");
        else if(n < 0)
            System.out.println("-");
        
        // EJERCICIO 4
        String nome1 = "Pepe";
        String nome2 = "Pedro";
        float peso1 = 70.8f;
        float peso2 = 65.4f;
        if(peso1>peso2)
            System.out.println(nome1 +" pesa "+ (peso1-peso2) + " mas que "+ nome2);
        else
            System.out.println(nome2 +" pesa "+ (peso2-peso1) + " mas que "+ nome1);
        
        // EJERCICIO 5
         int a = 8;
        int b = 3;
        int c = 5;
        
       if(a > b)
           if(a>c)
                System.out.println(a);
           else
                System.out.println(c);
       else if(b>c)
           System.out.println(b);
       else
           System.out.println(c);
       
       // EJERCICIO 6
        int ventas = Integer.parseInt(JOptionPane.showInputDialog("ventas"));
        if(ventas<=100)
            System.out.println("Baixo");
        else if(ventas>100 && ventas<=500)
            System.out.println("Medio");
        else if(ventas>500 && ventas<=1000)
            System.out.println("alto");
        else if(ventas>1000)
            System.out.println("primerira necesidade");
        
        // EJERCICIO 7
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Opcion"));
        switch (opcion){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("lado"));
                System.out.println(lado*lado);
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("altura"));                
                System.out.println(altura*base/2);
                break;
            case 3:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("radio"));
                System.out.println(Math.PI * Math.pow(radio, 2) );
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
            }
    }   
}
