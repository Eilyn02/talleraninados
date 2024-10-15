/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eilyn Alvarino
 */
import java.util.Scanner;
public class ejercicio10 {
    public static void main (String[] args){
    Scanner ent = new Scanner(System.in);
    
    int Ndia;
      
              
      System.out.println("Digite 1 para Domingo ");
      System.out.println("Digite 2 para Sabado");
      System.out.println("Digite 3 para Viernes ");
      System.out.println("Digite 4 para Jueves");
      System.out.println("Digite 5 para Miercoles");
      System.out.println("Digite 6 para Martes");
      System.out.println("Digite 7 para Lunes");
      
      Ndia=ent.nextInt();
      
      if(Ndia==1){
          System.out.println("el astro que dio origen a este nombre es: Sol");
      }else if(Ndia==2){
          System.out.println("el astro que dio origen a este nombre es: Saturno");
      }else if(Ndia==3){
          System.out.println("el astro que dio origen a este nombre es: Venus");
      }else if(Ndia==4){
          System.out.println("el astro que dio origen a este nombre es: Júpiter");
      }else if(Ndia==5){
          System.out.println("el astro que dio origen a este nombre es: Mercurio");
      }else if(Ndia==6){
          System.out.println("el astro que dio origen a este nombre es: Marte");
      }else if(Ndia==7){
          System.out.println("el astro que dio origen a este nombre es: Luna");
      }
      
      
    
    }
    
}
