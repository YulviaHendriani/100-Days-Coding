
package day41;

import java.util.Scanner;

public class Day41 {

    public static void main(String[] args) {
        int a,b,hasil;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nilai a: ");
        a = input.nextInt();
        
        System.out.print("Masukkan Nilai b: ");
        b = input.nextInt();
        
        hasil = a+b;
        
        if(hasil<=5){
            System.out.println("Total: "+(hasil+=2));
        }else{
            System.out.println("Total: "+(hasil-=3));
        }
    }
    
}
