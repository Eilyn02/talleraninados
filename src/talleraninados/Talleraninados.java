/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package talleraninados;

/**
 *
 * @author Eilyn Alvarino
 */
import java.util.Scanner;
public class Talleraninados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     double nota;
          System.out.println("Digite su nota");
          nota=teclado.nextDouble(); 
          
          if(nota>=0.0 && nota<=10.0){
                 System.out.println("Su Calificación es "); 
            }else{
            System.out.println("Esta calificación no es aceptada"); 
            }
             
          if(nota>=0.0 && nota<=5.9){
                System.out.println("E"); 
            }else if(nota>=6.0 && nota<=6.9){
                System.out.println("D"); 
            }else if(nota>=7.0 && nota<=7.9){
                System.out.println("C"); 
            }else if(nota>=8.0 && nota<=8.9){
                System.out.println("B"); 
            } else if(nota>=9.0 && nota<=10.0){
                 System.out.println("A"); 
            }

}
    }
    

