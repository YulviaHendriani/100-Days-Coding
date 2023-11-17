
package day40;

import java.util.Scanner;

public class Day40 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai a: ");
        int a = input.nextInt();
        
        System.out.println("Masukkan nilai b: ");
        int b = input.nextInt();
        
        int hasil=a-b;
         if (hasil<3){
             System.out.println("Total: "+(hasil+=10));
         }else{
             System.out.println("Total: "+(hasil-=3));
         }
    }
    
}
