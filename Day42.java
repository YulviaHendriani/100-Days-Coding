
package day42;

import java.util.Scanner;

public class Day42 {

    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        
         System.out.println("Masukkan batas: ");
         int batas = input.nextInt();
         
         for(int i=1; i<= batas; i++ ){
         System.out.println(i);
        }
    }
    
}
