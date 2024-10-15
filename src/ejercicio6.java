/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eilyn Alvarino
 */
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args){
    Scanner ent = new Scanner(System.in);
    
    int num1, num2, num3; 
    
    System.out.println("Digite el primer numero");
    num1=ent.nextInt();
    System.out.println("digite el segundo numero");
    num2=ent.nextInt();
    System.out.println("Digite el tercer numero");
    num3=ent.nextInt();
    
    //Condición del numero mayor
    if(num1>num2 && num1>num3){
        System.out.println(+num1+" Es el mayor");
   }else if(num2>num1 && num2>num3){
       System.out.println(+num2+" Es el mayor");
   }else{
       System.out.println(+num3+" Es el mayor"); 
            }
    
    //condicion del numero del medio
         if(num1<num2 && num1>num3 || num1>num2 && num1<num3 ){
                 System.out.println(+num1+" Es el del medio"); 
            } else if(num2<num1 && num2>num3 || num2>num1 && num2<num3 ){
                System.out.println(+num2+" Es el del medio"); 
                }else if(num3<num1 && num3>num2 || num3>num1 && num3<num2){
                System.out.println(+num3+" Es el del medio"); 
            }
    
    
    //Condición del numero menor
        if(num1<num2 && num1<num3){
        System.out.println(+num1+" Es el menor");
   }else if(num2<num1 && num2<num3){
       System.out.println(+num2+" Es el menor");
   }else{
       System.out.println(+num3+" Es el menor"); 
            }
            
    
    }
    
}
