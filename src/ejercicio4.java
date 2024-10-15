/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eilyn Alvarino
 */
import java.util.Scanner;
public class ejercicio4 {
         public static void main(String[] args) { 
 
        Scanner teclado = new Scanner(System.in); 
 
     int Vcompra, Vutil, div;
 
          System.out.println("Digite el valor de compra"); 
 
          Vcompra=teclado.nextInt();  
          
          System.out.println("Digite la vida util"); 
 
          Vutil=teclado.nextInt();  
          
          
             if(Vutil==20){ 
                 div=Vcompra / Vutil;
             System.out.println("El valor de depreciación por año de su Edificio es "+div);  
 
            }else if(Vutil==10){ 
                 div= Vcompra / Vutil;
             System.out.println("El valor de depreciación por año de su maquinaria, mueble o enser es "+div);
 
            } else if(Vutil==5){ 
                 div=Vcompra / Vutil;
             System.out.println("El valor de depreciación por año de su Vehiculo es " +div);
 
            } else if(Vutil==3){ 
                 div=Vcompra / Vutil;
             System.out.println("El valor de depreciación por año de su computador es "+div);
 
            } 
     } 

}
