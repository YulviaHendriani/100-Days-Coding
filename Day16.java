
package day16;

import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Total Belanja:");
        int  total_belanja = input.nextInt();
        
        if (total_belanja >= 100000){
            System.out.println("Kamu Dapat Hadiah");
       }else if (total_belanja < 100000){
            System.out.println("Maaf Kamu Tidak Dapat Hadiah");
       }
    }
    
}
