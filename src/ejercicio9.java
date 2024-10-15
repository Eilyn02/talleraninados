/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eilyn Alvarino
 */
import java.util.Scanner;
public class ejercicio9 {
    public static void main (String[] args){
       Scanner ent = new Scanner(System.in);
       
     int Categ, horaD, total, Desc, sueld;
     
     System.out.println("Digite las horas dictadas");
     horaD=ent.nextInt();
      System.out.println("Digite su categoria");
      System.out.println("1 para A");
      System.out.println("2 para B");
      System.out.println("3 Para C");
      System.out.println("4 para D");
     Categ=ent.nextInt();
     
     
       if(Categ>0 && Categ<=4){
            }else{
            System.out.println("Esta categoria no esta establecida"); 
            }
     
     if(Categ==1){
         total=25000*horaD;
         Desc= (total*10)/100;
         sueld = total-Desc;
                 
                 System.out.println("Su sueldo es "+sueld);
         
     }else if(Categ==2){
         total=22000*horaD;
         Desc= (total*10)/100;     
         sueld = total-Desc;
                 System.out.println("Su sueldo es "+sueld); 
    }else if(Categ==3){
         total=20000*horaD;
         Desc=(total*10)/100;
         sueld = total-Desc;
                 System.out.println("Su sueldo es "+sueld);
    }else if(Categ==4){
         total=19000*horaD;
         Desc=(total*10)/100;
         sueld = total-Desc;
                 System.out.println("Su sueldo es "+sueld);
     
    }
    
}
}
