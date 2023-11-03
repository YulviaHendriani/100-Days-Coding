
package day26;

import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {
        // 
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan a:");
         int a = input.nextInt();
         System.out.println("Masukkan b:");
         int b =input.nextInt();
         
         if (a < b){
         for (int c=a; c<=b; c++){
         System.out.println(c);
            }
         }else{
         for(int c=b; c<=a; c++){
         System.out.println(c);
            }
         }   
    }
}